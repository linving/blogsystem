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
    
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="">
	<meta http-equiv="description" content="">
	<link href="css/layout.css" rel="stylesheet" type="text/css" media="screen" />
  </head>
  
  <body>
	<s:include value="top_navigation.jsp" />
	<div id="content">
	<div id="page">
		<div id="column1">
			<s:action name="getUserList" executeResult="false" var="users"/>
   			<s:set value="#users.getUsers()" name="userList"/>
   			<s:iterator value="#userList" id="user">
			<div class="index_user_face">
				<a href="linkToBlog?userName=<s:property value="#user.userName"/>" ><img src="user_face/<s:property value="#user.userFaceTitle"/>" class="index_user_face"/></a>
				<p>
				<a href="linkToBlog?userName=<s:property value="#user.userName"/>"  class="index_blog_name_link">
					<s:property value="#user.userName"/>
				</a>
				</p>
			</div>
			</s:iterator>
			
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
<s:include value="footer.jsp" />
  </body>
</html>
