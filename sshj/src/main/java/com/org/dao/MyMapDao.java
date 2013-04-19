package com.org.dao;

import java.util.LinkedHashMap;
import java.util.List;

import com.org.common.MyMap;

public interface MyMapDao {
	public <T> List<MyMap> getMapData(Class<T> entityClass,String id,String key, String wherejpql, Object[] queryParams,LinkedHashMap<String, String> orderby);
}
