<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>

<%
	String path = request.getContextPath();
	String ctxPath = request.getContextPath() + "/";
%>

<%
	response.sendRedirect(ctxPath + "UserServlet");
%>