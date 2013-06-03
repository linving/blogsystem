<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@taglib prefix="s" uri="/struts-tags" %>
<title>Insert title here</title>
<link href="css/layout.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
	<s:include value="user_navigation.jsp" />
	<div id="content">
	<div id="page">
		<div id="column1">
			<form action="updatePersonalInfo" method="post">
            <table width="100%" border="0">
  <tr>
    <td width="30%"align="right">用户名</td>
    <td width="70%"><s:property value="user.userAccount"/></td>
  </tr>
  <tr>
    <td align="right">真实姓名</td>
    <td><input type="text" name="userName" value="<s:property value="user.userName"/>"/></td>
  </tr>
  <tr>
    <td align="right">电子邮件</td>
    <td><input type="text" name="mail" value="<s:property value="user.mail"/>"/></td>
  </tr>
  <tr>
    <td align="right">博客名称</td>
    <td><input type="text" name="blogName" value="<s:property value="user.blogName"/>"/></td>
  </tr>
  <tr>
    <td align="right">博客描述</td>
    <td><input type="text" name="blogDescription" value="<s:property value="user.blogDescription"/>"/></td>
  </tr>
    <tr>
    <td align="right"></td>
    <td><input  type="submit" value="保存设置"></td>
  </tr>
  </table>
  </form>
  <br/>
  <s:form action="updateUserFace" enctype="multipart/form-data">
       <table width="100%" border="0">
  <tr>
    <td width="30%" align="right">头像</td>
    <td width="70%">
    	<img src="user_face/<s:property value="user.userFaceTitle"/>" width="100px" height="100px"/>
    </td>
  </tr>
  <tr>
    <td align="right">上传新头像</td>
    <td><s:file name="upload" label="选择文件"/></td>
  </tr>
  <tr>
    <td align="right"></td>
    <td><s:submit value="上传"/></td>
  </tr>
  	</table>
  </s:form>
  <br/>
  <form action="updateUserPassword" method="post">
   <table width="100%" border="0">
  <tr>
    <td width="30%"align="right">当前密码</td>
    <td width="70%"><input type="password" name="currentPassword"/></td>
  </tr>
  <tr>
    <td align="right">新密码</td>
    <td><input type="password" name="newPassword"/></td>
  </tr>
  <tr>
    <td align="right">再次输入新密码</td>
    <td><input type="password" name="confirmNewPassword"/></td>
  </tr>
<tr>
    <td align="right"></td>
    <td><input  type="submit" value="更改密码"></td>
  </tr>
</table>
            </form>
		</div>
		<div id="column2">
			
		</div>
	</div>
	<div style="clear: both;">&nbsp;</div>
</div>
</body>
</html>