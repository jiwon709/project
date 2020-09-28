package com.my.ssday0919.dao;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.my.ssday0919.api.VisionColor;
import com.my.ssday0919.api.VisionLabel;
import com.my.ssday0919.api.VisionTemp;
import com.my.ssday0919.vo.drugVO;
import com.my.ssday0919.vo.uploadVO;
import com.my.ssday0919.vo.visionVO;

public class uploadDAO {
	
	private static SqlSession sqlSession;
	
	//이미지 업로드
	public static String upload(uploadVO vo,MultipartFile uploadfile)  { 
		String filePath = null;
		
		//업로드 파일이 존재하는지 안하는지
		if(uploadfile.isEmpty()==false) {
			//파일명 지정후
			String originalfilename = uploadfile.getOriginalFilename();
			vo.setOriginalfilename(originalfilename);
			
			try {
				//C드라이브에 test란 폴더에 파일명으로 이미지 업로드
				uploadfile.transferTo(new File("C:/test/"+originalfilename));
				filePath = "C:/test/"+originalfilename;
				
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		
		//filePath uploadVO객체 중 filePath에 대입 후 대입확인
		vo.setFilePath(filePath);
		System.out.println("dao 파일 주소 :"+vo.getFilePath());
		
		//label,drugList함수 filePath로 실행
		label(filePath);
		drugList(filePath);
		
		
		return filePath;
	}
		
	
	//비전 실행 후 라벨 검색결과 String으로 출력 (Pill인지 확인하려고)
	public static String label(String filePath) {
		String label = null;
		
		visionVO vo = new visionVO();
			
		try {
			//label분석 함수 실행
			label = VisionLabel.detectLabels(filePath);
			
		} catch (IOException e) {
			e.printStackTrace();
		}			
		
		//label분석 결과 값 visionVO 객체 중 label에 대입 후 출력
		vo.setLabel(label);
		System.out.println("라벨 값 :"+vo.getLabel());

		return label;
	}
	
	
	//비전 실행 후 검색결과 arrayList로 리턴
	public static ArrayList<drugVO> drugList(String filePath) {
		//return할 list선언
		ArrayList<drugVO> list = new ArrayList<>();
		
			try {
				//색깔 분석, 텍스트 분석 후 list에 대입
				ArrayList<String> color = VisionColor.detectProperties(filePath);
				ArrayList<String> temp = VisionTemp.detectOcr(filePath);
				
					//해쉬 맵 이용해서 String변수에 Object 대입
					Map<String,Object> param = new HashMap<String,Object>();
					
					//ex) param이란 변수를 선언할 거고, 위에 temp라고 선언한 list를 집어넣을거다
					//해쉬 맵에 여러 값 대입 가능
					param.put("param",temp);
					param.put("color",color);
					
					//param이 비었는지 안 비었는지 확인하려고
					System.out.println(param.isEmpty());
					
					//무슨 값 들어갔는지 확인
					System.out.println("param 출력:"+param.toString());
					
					//데이터베이스에서 검색 후 결과값 list에 대입
					uploadMapper mapper = sqlSession.getMapper(uploadMapper.class);
					list = mapper.upload(param);
	
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		return list;
	}
	
	

}