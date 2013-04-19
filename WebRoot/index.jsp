<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="">
	<meta http-equiv="description" content="">
	<link href="css/layout.css" rel="stylesheet" type="text/css" media="screen" />
  </head>
  
  <body>
    <div id="header">
	<div id="logo">
		<h1>YingMing Blog System</h1>
		<p><a href="#" target="_blank">Design by YingMing</a></p>
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
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			<div class="index_user_face">
				<a href="#" ><img src="user_face/zgr.jpg" class="index_user_face"/></a>
			</div>
			
		</div>
		<div id="column2">
			<div id="login">

				<form name="form1" method="post" action="login">
			      <table width="256" border="0">
			        <tr>
			          <td width="71" align="right">账号：</td>
			          <td width="175"><input type="text" name="userAccount"></td>
		            </tr>
			        <tr>
			          <td align="right">密码：</td>
			          <td><input type="password" name="userPass"></td>
		            </tr>
			        <tr>
			          <td align="right">&nbsp;</td>
			          <td>
                      	<input type="submit">
				 		<a href="register.jsp">注册</a>
				 		<a href="forgetPassword">忘记密码</a>
                      </td>
		            </tr>
		          </table>
			  </form>
				<p>&nbsp;</p>
			</div>
			
		</div>
	</div>
	<div style="clear: both;">&nbsp;</div>
</div>
<div id="footer">
	<p>&copy;&nbsp;Copyright 2013. All Rights Reserved. Design by YingMing </p>
</div>
  </body>
</html>
