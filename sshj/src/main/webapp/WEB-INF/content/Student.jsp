<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" defer="defer">
	function studentDetail(id) {
		var params = {
				id : id
			};
			$.ajax({
				type: "GET",
				url: "Student!getStudentById",
				data: params,
				dataType:"json",
				cache: false,
				success: function(json){
					
				},
				error: function(json){
					alert("json=" + json);
					return false;
				}
			});
		
	}
</script>
</head>
<body>
	
	<table border="1">
		<tr>
			<td colspan="7" align="center">以学生为主体，展示学生信息</td>
		</tr>
		<tr>
			<td>NO.</td>
			<td>姓名</td>
			<td>性别</td>
			<td>地址</td>
			<td>班级</td>
			<td>老师</td>
			<td></td>
		</tr>
		<c:forEach items="${listStudent}" var="st">
			<tr>
				<td><c:out value="${st.id}"/></td>
				<td>
					<a href="javascript:studentDetail(<c:out value="${st.name}"/>);"><c:out value="${st.name}"/></a>
				</td>
				<td><c:out value="${st.sex}"/></td>
				<td><c:out value="${st.idcard.address}"/></td>
				<td><c:out value="${st.clazz.className}"/></td>
				<td>
					<c:forEach items="${st.studentTeachers}" var="th">
						<c:out value="${th.teacher.teacherName}"/>
					</c:forEach>
				</td>
				<td>
					<input type="button" value="删除" />
				</td>
			</tr>
		</c:forEach>
	</table>
	<div style="border:1px solid">
		<s:form action="" theme="simple" method="post">
			<table border="1">
				<tr>
					<td colspan="8" align="center"><strong>学生信息编辑</strong></td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td>
						<s:textfield name="st.name" cssStyle="width:100px" />
					</td>
					<td>性别 ：</td>
					<td>
						<s:select list="#{1:'男',2:'女'}" name="st.sex"></s:select>
					</td>
					<td>班级：</td>
					<td>
						<s:select list="%{listClass}" name="" listKey="key" listValue="value"></s:select>
					</td>
					<td>老师：</td>
					<td>
						<s:checkboxlist list="%{listTeacher}" name="" listKey="key" listValue="value"></s:checkboxlist>
					</td>
				</tr>
				<tr>
					<td>地址：</td>
					<td colspan="7"><s:textfield name="" cssStyle="width:300px" /></td>
				</tr>
				<tr>
					<td colspan="8">
						<s:submit value="保存" />
						<input type="button" value="清除" onclick="" />
					</td>
				</tr>
			</table>
			
			<s:hidden name="st.id" />
		</s:form>
	</div>
	<p>------------------------------------------------------邪恶的分割线------------------------------------------------------</p>
	
</body>
</html>