package com.org.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Results({  
    @Result(name="message", location="/WEB-INF/content/common/message.jsp")  
  })  
@Namespace("/")
public class UserManageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Action(value = "/addUI", results = { @Result(name = "add", location = "/another/url", type = "redirect") })  
    public String addUI() {  
        return "add";  
    }  
      
    public String add() {  
        return "message";  
    }  
      
    public String editUI() {  
        return "edit";  
    }  
      
    public String edit() {  
        return "message";  
    }  
      
    @Action(value="/another/url")  
    public String another() {  
        return "another";  
    } 
}
