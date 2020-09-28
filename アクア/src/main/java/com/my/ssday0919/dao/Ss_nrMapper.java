package com.my.ssday0919.dao;

import java.util.ArrayList;

import com.my.ssday0919.vo.Ss_nrVO;

public interface Ss_nrMapper {
	public ArrayList<Ss_nrVO> getnrlist();
	public ArrayList<Ss_nrVO> searchnrlist(String PRDCT_NM);
	public Ss_nrVO thenr(String PRDCT_NM);
}
