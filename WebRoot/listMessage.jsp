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
		<s:iterator value="messages" id="message">
			<div class="listMessageBox">
				<div class="messageTitle">
					<s:property value="#message.user.userName"/>发表于
					<s:date name="#message.saveTime" format="yyyy-MM-dd HH:mm:ss"/>
				</div>
				<div class="messageContent">
					<p><s:property value="#message.messageContent"/></p>
				</div>
			</div>
		</s:iterator>
			<div>
				共&nbsp;<s:property value="totalPageCounts"/>&nbsp;页&nbsp;|&nbsp;
				第&nbsp;<span><s:property value="currentPage"/></span>&nbsp;页&nbsp;|&nbsp;
				共&nbsp;<span><s:property value="totalRecordCounts"/></span>&nbsp;条留言
				
				[&nbsp;<a href="listMessage?currentPage=1">首页</a><span>|</span>
			    <a href="listMessage?currentPage=<s:property value="currentPage-1"/>">上一页</a><span>|</span>
			    <a href="listMessage?currentPage=<s:property value="currentPage+1"/>">下一页</a><span>|</span>
			    <a href="listMessage?currentPage=<s:property value="totalPageCounts"/>">末页</a>
			    &nbsp;]&nbsp;转至:<input type="text" size="2" /><input type="button" value="Go">
				
			</div>
		<form method="post"  action="writeMessage">
		    <div id="writeMessageBox">
		    	<div ><p id="writeMessageTitle">欢迎评论</p>
		    	<p id="writeMessageContent"><textarea name="content" cols="70" rows="10"></textarea></p>
		    	</div>
		    	<div id="writeMessageSubmitButton">
		    	<input type="submit" value="提交" style="font-size:18px;"/>
		    	</div>
		    </div>
			</form>
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
