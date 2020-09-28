package com.my.ssday0919.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.EntityAnnotation;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;
import com.my.ssday0919.vo.uploadVO;


public class VisionTemp {
	
	public static ArrayList<String> detectOcr(String filePath) throws FileNotFoundException, IOException {
		
		//return 값 변수 
		ArrayList<String> text = new ArrayList<>();
		
		//요청 list
		List<AnnotateImageRequest> requests = new ArrayList<>();
		
		//filePath에 있는 이미지 byte단위로 대입
		ByteString imgBytes = ByteString.readFrom(new FileInputStream(filePath));
		
		//이미지 불러오기
		Image img = Image.newBuilder().setContent(imgBytes).build();
		Feature feat = Feature.newBuilder().setType(Type.TEXT_DETECTION).build();
		AnnotateImageRequest request = AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
			requests.add(request);
			
			//response에 응답 입력받고 list에 대입
			try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
				BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
				List<AnnotateImageResponse> responses = response.getResponsesList();
				
					//응답 횟수만큼 분석
					for (AnnotateImageResponse res : responses) {
							if (res.hasError()) {
								System.out.printf("Error: %s\n", res.getError().getMessage());
								return text;
							}

							// For full list of available annotations, see http://g.co/cloud/vision/docs
							for (EntityAnnotation annotation : res.getTextAnnotationsList()) {
								//텍스트와 x,y위치 값 출력
								//System.out.printf("Text: %s\n", annotation.getDescription());
								//System.out.printf("Position : %s\n", annotation.getBoundingPoly());
								
								//리스트에 현재 배열 저장가능
								text.add(0, annotation.getDescription());
							}
					}
					
					//리스트에 들어갔는지 확인
					//System.out.println(text.toString());
					
					//split 활용
					String[] textTemp = text.toString().split(",");
		
					for (int i = 0; i < textTemp.length; i++) {
						text.add(textTemp[i]);
					}
					
					//textTemp에 들어갔는지 확인
//					for (int i = 0; i < textTemp.length; i++) {
//						System.out.println(textTemp[i]);
//					}

			}
			
			return text;
	}
}