package com.my.ssday0919.dao;

import java.util.ArrayList;
import java.util.Map;

import com.my.ssday0919.vo.drugVO;

public interface uploadMapper {

	public ArrayList<drugVO> upload(Map<String, Object> param);

}
