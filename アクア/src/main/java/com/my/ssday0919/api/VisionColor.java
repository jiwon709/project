package com.my.ssday0919.api;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.ColorInfo;
import com.google.cloud.vision.v1.DominantColorsAnnotation;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;
import com.my.ssday0919.vo.uploadVO;
import com.my.ssday0919.vo.visionVO;

public class VisionColor {	
	
  public static ArrayList<String> detectProperties(String filePath) throws IOException {
	
	//return할 String 지정
	ArrayList<String> visionColor = new ArrayList<>();
	
	
    List<AnnotateImageRequest> requests = new ArrayList<>();
    
    //filePath경로에 있는 이미지를 Byte단위로 대입
    ByteString imgBytes = ByteString.readFrom(new FileInputStream(filePath));

    //이미지 불러오기
    Image img = Image.newBuilder().setContent(imgBytes).build();
    Feature feat = Feature.newBuilder().setType(Feature.Type.IMAGE_PROPERTIES).build();
    AnnotateImageRequest request =
        AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
    requests.add(request);


    //이미지 분석 시도 , response로 응답받고, list에 응답 저장
    try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
      BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
      List<AnnotateImageResponse> responses = response.getResponsesList();
      
      //응답 횟수만큼 색깔 분석, 에러 먼저 검출
      for (AnnotateImageResponse res : responses) {
        if (res.hasError()) {
          System.out.format("Error: %s%n", res.getError().getMessage());
          return visionColor;
        }

        //색깔 분석 변수
        DominantColorsAnnotation colors = res.getImagePropertiesAnnotation().getDominantColors();        
        
        //빨,주,파 for문에 쓰고 결과값 받기 위해 변수지정
        int r,g,b;
        
        //추출한 색깔 저장하기 위해 변수지정
        String colorName;

        //visionVO 객체에 color값 지정해주기 위해 객체 생성
        visionVO vo = new visionVO();
        
        //사진에 있는 color 수만큼 color를 검색한다는 foreach문
        for (ColorInfo color : colors.getColorsList()) {
        	//빨강, 초록, 파랑 범위 지정해주기 위해 변수명 짧게 쓰려고 지정
        	float total = color.getPixelFraction();
        	float red = color.getColor().getRed();
        	float green = color.getColor().getGreen();
        	float blue = color.getColor().getBlue();        	
        
        //색깔 확인하기 위해 출력
        // System.out.format(
        //     "fraction: %f%nr: %f, g: %f, b: %f%n", total,red,green,blue);
 
          	//색깔 범위 지정하기 위해 int값으로 변환
          	r = Math.round(red);
          	g = Math.round(green);
          	b = Math.round(blue);
          	
 
          	//색깔 범위 지정 그림판 RGB 판 참고하여 색깔 지정 => 확실한 값 아님
          		if (r<=150 && (160<=g && g<=200) && b<=100) {
 
              		colorName = "연두";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if (r<=50 && (70<=g && g<=80) && b<=70) {
              		
              		colorName = "청록";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if (r<=180 && 80<=g && (70<=b && b<=120)) {
              		
              		colorName = "초록";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if (r>=180 && g<=50 && b<=50) {
              		
              		colorName = "빨강";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if ((r>=120) && (g>=50 && g<=80) && (80<=b && b<=100)) {
              		
              		colorName = "자주";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if(r>=250 && g>120 && b>140) {
          			
          			colorName = "자주";
          			vo.setColor(colorName);
          			
          		}
              	
              	else if (r>=220 && (180<=g && g<=220) && (120<=b && b<=150)) {

              		colorName = "주황";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if ((r>=180) && (100<=g && g<=120) && (100<=b && b<=140)) {

              		colorName = "분홍";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if(r>=240 && g>=240 && b>=240) {
          			
          			colorName = "하양";
          			vo.setColor(colorName);
          			
          		}
              	
              	else if(r<=60 && g<=140 && b>=150) {
          			
          			colorName = "파랑";
          			vo.setColor(colorName);
          			
          		}
              	
              	else if ((r>=140 && r<=200) && (130<=g && g<=190) && b<=110) {
              		
              		colorName = "갈색";
              		vo.setColor(colorName);
              		
              	}
              	
              	else if(r<=40 && g<=40 && b<=40) {
          			
          			colorName = "검정";
          			vo.setColor(colorName);
          			
          		}
              	
              	else if ((r>=135 && r<=160) && (150<=g && g<=170) && (140<=b && b<=160)) {
              		
              		colorName = "회색";
              		vo.setColor(colorName);
              	
              	}
          		
          		
          		//visionVO에서 color 값이 들어있으면 arrayList에 그 값을 추가한다.
          		if(vo.getColor().isEmpty()==false)
          			visionColor.add(0, vo.getColor());

          		
        }
        
        //들어갔는지 확인
        for (int i = 0; i < visionColor.size(); i++) {
			System.out.println("리스트 번호 : "+i+"값 : "+visionColor.get(i));
		}
        
      }
      
    }
    
    return visionColor;
  }
}