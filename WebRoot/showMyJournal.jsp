<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'comment.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/layout.css" rel="stylesheet" type="text/css" media="screen" />

  </head>
  
  <body>
    <div id="header">
	<div id="logo">
		<h1>Business Name</h1>
		<p><a href="http://www.cssMoban.com" target="_blank">Template Design by cssMoban.com</a></p>
	</div>
	<div id="navigation">
		<ul>
			<li><a href="#" class="first">Member</a></li>
			<li><a href="#">undetermined</a></li>
			<li><a href="#">undetermined</a></li>
			<li><a href="#">undetermined</a></li>
			<li><a href="listMessage">Your Advice</a></li>
			<li><a href="#">Support</a></li>
			<li><a href="#">About Us</a></li>
		</ul>
	</div>
</div>

<div id="content">
	<div id="page">
		<div id="column1">
		
			<div class="listjournalBox">
				<div class="journalTitle">
					<s:property value="title"/>
					
				</div>
				<div class="journalContent">
					<s:property value="journalContent" escape="false"/>
				</div>
			</div>
		
		
		</div>
		<div id="column2">
			
		</div>
	</div>
	<div style="clear: both;">&nbsp;</div>
</div>
<div id="footer">
	<p>&copy;&nbsp;Copyright 2009. All Rights Reserved. template design by <a href="http://www.cssMoban.com" class="links">cssMoban.com</a> </p>
</div>

  </body>
</html>
