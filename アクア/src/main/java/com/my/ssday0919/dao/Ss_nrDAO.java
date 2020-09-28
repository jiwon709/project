package com.my.ssday0919.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.ssday0919.vo.Ss_nrVO;

@Repository
public class Ss_nrDAO {
	
	@Autowired
	private SqlSession sqlSession;

	// 가계부 화면이동
	public ArrayList<Ss_nrVO> getnrlist() {
		ArrayList<Ss_nrVO> list = null;
		
		try {
			// MoneybookMapper 인터페이스를 객체 생성
			Ss_nrMapper mapper = sqlSession.getMapper(Ss_nrMapper.class);
//			list = mapper.getmblist(vo.getUserid(), vo.getInputdate(), vo.getMemo(), vo.getType(), vo.getAmount());
			list = mapper.getnrlist();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList<Ss_nrVO> searchnrlist(String PRDCT_NM) {
		ArrayList<Ss_nrVO> list = null;
		
		try {
			// MoneybookMapper 인터페이스를 객체 생성
			Ss_nrMapper mapper = sqlSession.getMapper(Ss_nrMapper.class);
//			list = mapper.getmblist(vo.getUserid(), vo.getInputdate(), vo.getMemo(), vo.getType(), vo.getAmount());
			list = mapper.searchnrlist(PRDCT_NM);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Ss_nrVO thenr(String PRDCT_NM) {
		Ss_nrVO vo = null;
		
		try {
			// MoneybookMapper 인터페이스를 객체 생성
			Ss_nrMapper mapper = sqlSession.getMapper(Ss_nrMapper.class);
//			list = mapper.getmblist(vo.getUserid(), vo.getInputdate(), vo.getMemo(), vo.getType(), vo.getAmount());
			vo = mapper.thenr(PRDCT_NM);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
}







