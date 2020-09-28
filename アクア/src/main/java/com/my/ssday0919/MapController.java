package com.my.ssday0919;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.ssday0919.dao.Ss_nrDAO;

// Controller 는 해당 클래스를 container 에서 관리하도록 지정하며
// Controller 역할을 하는 클래스임을 의미
@Controller
public class MapController {
	
	@Autowired
	private Ss_nrDAO dao;
	
//	#ebebeb
	@RequestMapping(value = "/map/pharmacy", method = RequestMethod.GET)
	public String pharmacy() {
		
		return "/map/pharmacy";
	}
	
	@RequestMapping(value = "/map/hospital", method = RequestMethod.GET)
	public String hospital() {
		
		return "/map/ss_nr";
	}
}