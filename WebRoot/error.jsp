<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><s:text name="errorPage"/></title>
	<meta http-equiv="Content-Type" content="text/html; charset=GBK">
</head>
<body>
	<s:if test="#session.tip!=null">
		<h1 align="center"><s:property value="#session.tip"/></h1>
	</s:if>
	<s:else>
		<h1 align="center">出错啦~!~</h1>
	</s:else>
</body>
</html>