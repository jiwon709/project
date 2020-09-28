package com.my.ssday0919.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.my.ssday0919.dao.uploadDAO;
import com.my.ssday0919.vo.drugVO;
import com.my.ssday0919.vo.uploadVO;
import com.my.ssday0919.vo.visionVO;

@Controller
public class imgController {

	//팝업창 띄우기
	@RequestMapping(value = "/uploadform", method = RequestMethod.GET)
	public String uploadform() {
     
		return "/upload/uploadform";
	}
	
	//이미지 파일 업로드
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	public String file(uploadVO vo, MultipartFile uploadfile,RedirectAttributes rttr) {
		
		//img 저장된 filePath가져오기 위한 변수, 분석된 label 저장하기 위한 변수
		String filePath = null;
		String label = null;
		
			//이미지 업로드 함수 실행, label 함수 실행
			try {
				filePath = uploadDAO.upload(vo, uploadfile);
				label = uploadDAO.label(filePath);
				
				//라벨 중 Pill이 검출되면 upload/drug_imgUpload 함수 실행
				if(label.indexOf("Pill") > -1) {
					return "redirect:/upload/drug_imgUpload";
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//Pill이 검출되지 않았으면 메인화면 출력
			if(label == null) {
				rttr.addFlashAttribute("label", label);
				return "HOME";
			}
		
		return "redirect:HOME";
	}
	
	
	//팝업창에서 검색리스트 창 화면 이동 
	//이미지 업로드 후 주소 그대로 비전 실행
	//아직 에러 해결 x, 구현 안됌
	@RequestMapping(value = "/upload/drug_imgUpload", method = RequestMethod.GET)
	public String drug_img(String filePath,Model model,uploadVO vo, MultipartFile uploadfile) {

		ArrayList<drugVO> list = new ArrayList<>();
		
		list = uploadDAO.drugList(filePath);
		
		if(list.size()==0) {
			return "/";
		}
		
		//결과 확인
		for (int i = 0; i < list.size(); i++) {
			System.out.println("DAO출력 : "+list.get(i).getDrug_nm());
		}
		
		model.addAttribute("vo", list);
		
		return "/upload/drug_img";
	}
	
	//검색화면 이동
	@RequestMapping(value = "/upload/drug_img", method = RequestMethod.GET)
	public String drug_img() {

		return "/upload/drug_img";
	}
		
	
	
}
