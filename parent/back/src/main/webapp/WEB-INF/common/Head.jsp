<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basepath="";
	if(request.getServerPort()!=80)
	{
		basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	}
	else
	{
		basepath=request.getScheme()+"://"+request.getServerName()+request.getContextPath();
		
	}
	pageContext.setAttribute("basepath",basepath);
	pageContext.setAttribute("resourceServer", "http://172.18.0.10");
	pageContext.setAttribute("imgServer", "http://172.18.0.27");
%>