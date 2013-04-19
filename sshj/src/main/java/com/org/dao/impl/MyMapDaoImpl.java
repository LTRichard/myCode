package com.org.dao.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.org.common.MyMap;
import com.org.dao.MyMapDao;

@Component("myMapDao")
public class MyMapDaoImpl extends BaseDaoImpl implements MyMapDao {
	
	public <T> List<MyMap> getMapData(Class<T> entityClass,String id,String key, String wherejpql, Object[] queryParams,LinkedHashMap<String, String> orderby) {
		List<MyMap> listMap = new ArrayList<MyMap>();
		
		String entityname = getEntityName(entityClass);
		Query query = em.createQuery("select o."+id+",o."+key+" from "+ entityname+ " o "+(wherejpql==null? "": "where "+ wherejpql)+ buildOrderby(orderby));
		setQueryParams(query, queryParams);
		
		List<?> rs = query.getResultList();
		if(rs != null) {
			for(int i=0;i<rs.size();i++) {
				Object[] o = (Object[]) rs.get(i);
				MyMap map = new MyMap();
				map.setKey(o[0].toString());
				map.setValue(o[1].toString());
				listMap.add(map);
			}
		}
		
		return listMap;
	}
}
