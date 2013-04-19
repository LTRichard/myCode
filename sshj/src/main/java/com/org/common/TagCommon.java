package com.org.common;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.org.dao.MyMapDao;

@Component("tagCommon")
public class TagCommon {

	@Resource
	MyMapDao myMapDao;
	
	public <T> List<MyMap> getMapData(Class<T> entityClass,String id,String key, String wherejpql, Object[] queryParams,LinkedHashMap<String, String> orderby){
		
		return myMapDao.getMapData(entityClass, id, key, wherejpql, queryParams, orderby);
	}
}
