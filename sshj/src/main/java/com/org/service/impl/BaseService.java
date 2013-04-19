package com.org.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.org.common.CodeCommon;
import com.org.dao.BaseDao;
import com.org.model.Student;

public class BaseService {
	
	@Resource
	BaseDao baseDaoImpl;
	
	/**
	 * 处理数据集
	 * @author LT.x-wang
	 * @param dealDivision listStudent,string 1:jsp->db  2:db->jsp
	 * @returnList<Student>
	 */
	public List<Student> dealResult(String dealDivision, List<Student> listStudent) {
		if(listStudent == null || listStudent.size() == 0) {
			return listStudent;
		}
		List<Student> resultReturn = new ArrayList<Student>();
		for(Student st : listStudent) {
			//性别
			if(CodeCommon._sb2jsp.equals(dealDivision)) {
				st.setSex(CodeCommon._male.equals(st.getSex())?CodeCommon._male_show:CodeCommon._female_show);
			}
			else {
				st.setSex(CodeCommon._male_show.equals(st.getSex())?CodeCommon._male:CodeCommon._female);
			}
			
			resultReturn.add(st);
		}
		return resultReturn;
	}
}
