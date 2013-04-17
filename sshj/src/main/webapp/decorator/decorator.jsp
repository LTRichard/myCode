<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My Site -<decorator:title default="Welcome! 装饰器页面。。。" /></title>
    <decorator:head></decorator:head>
  </head>
  <body>
 	 	<p><font color="red">before  body</font></p>
    	<decorator:body ></decorator:body>
    	<p><font color="red">After body</font></p>
  </body>
</html>
