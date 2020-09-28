package com.my.ssday0919;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.ssday0919.dao.Ss_nrDAO;
import com.my.ssday0919.vo.Ss_nrVO;

// Controller 는 해당 클래스를 container 에서 관리하도록 지정하며
// Controller 역할을 하는 클래스임을 의미
@Controller
public class DrugController {
	
	@Autowired
	private Ss_nrDAO dao;
	
	
	@RequestMapping(value = "/ss_nr", method = RequestMethod.GET)
	public String ss_nr() {
		
		return "/ss_nr/ss_nr";
	}
	
	// 가계부
	@RequestMapping(value = "/ss_nr/getnrlist", method = RequestMethod.GET)
	public String getnrlist(Model model) {
//		Ss_nrVO vo = new Ss_nrVO();
		
		// session 영역에 저장된 데이터 중에서 key값이 userid 인 데이터의 value 값을 반환하여
		// 문자열로 형 변환한 다음, 변수 userid 에 대입
//		String userid = (String)session.getAttribute("userid");
		
		// MoneybookVO 객체의 setUserid 메서드를 호출하여 변수 userid를 매개변수로 전달 
//		vo.setUserid(userid);
		
		// MoneybookDAO 객체의 getmblist 메서드를 호출하여 가계부 목록을 가져옴
		ArrayList<Ss_nrVO> list = dao.getnrlist();
		model.addAttribute("list", list);
		return "/ss_nr/ss_nr";
	}
	
	// 가계부 화면 이동
	@RequestMapping(value = "/ss_nr/searchnrlist", method = RequestMethod.POST)
	public String searchnr(String PRDCT_NM, Model model) {
		ArrayList<Ss_nrVO> list = dao.searchnrlist(PRDCT_NM);
		model.addAttribute("list", list);
		
//		return "redirect:/getnrlist";
		return "/ss_nr/ss_nr";
	}
	
	//해당 nr 정보 보여주기
	@RequestMapping(value = "/ss_nr/thenr", method = RequestMethod.GET)
	public String thenr(String PRDCT_NM, Model model) {
//		ArrayList<Ss_nrVO> list = dao.searchnrlist(vo);
//		model.addAttribute("list", list);
		Ss_nrVO vo = dao.thenr(PRDCT_NM);
		model.addAttribute("vo", vo);
		return "/ss_nr/thenr";
	}
	
}






