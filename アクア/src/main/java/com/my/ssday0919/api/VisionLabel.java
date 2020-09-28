package com.my.ssday0919.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.EntityAnnotation;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;
import com.my.ssday0919.vo.uploadVO;
import com.my.ssday0919.vo.visionVO;

public class VisionLabel {


  public static String detectLabels(String filePath) throws IOException {
	
	//return 값 지정
	String label = null;
	
	//요청 list 생성
    List<AnnotateImageRequest> requests = new ArrayList<>();
    
    //이미지 byte단위로 입력
    ByteString imgBytes = ByteString.readFrom(new FileInputStream(filePath));

    //img 불러오기
    Image img = Image.newBuilder().setContent(imgBytes).build();
    Feature feat = Feature.newBuilder().setType(Feature.Type.LABEL_DETECTION).build();
    AnnotateImageRequest request =
        AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
    requests.add(request);

    //response에 응답 입력받고, list로 대입
    try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
      BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
      List<AnnotateImageResponse> responses = response.getResponsesList();

      //visionVO 객체에 label값 지정하기 위한 객체 생성
      visionVO vo = new visionVO();
      
      //응답횟수만큼 label 분석
      for (AnnotateImageResponse res : responses) {
        if (res.hasError()) {
          System.out.format("Error: %s%n", res.getError().getMessage());
          return label;
        }


        for (EntityAnnotation annotation : res.getLabelAnnotationsList()) {
        //사진 속 전체 라벨 출력	
//          annotation
//              .getAllFields()
//              .forEach((k, v) -> System.out.format("%s : %s%n", k, v.toString()));
 

          //이미지 분석 결과 Pill이면 visionVO객체 중 label에 대입
          if(annotation.getDescription().indexOf("Pill") > -1) {
          label = annotation.getDescription();
          vo.setLabel(label);
          }
          
        }
        
      }
      
      //객체에 저장됬는지 확인
      System.out.println(vo.getLabel());
      
    }
    
    return label;
  }
}