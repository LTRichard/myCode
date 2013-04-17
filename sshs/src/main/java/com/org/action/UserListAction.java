package com.org.action;

import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class UserListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public String execute() {  
        return "success";  
    }  
}
