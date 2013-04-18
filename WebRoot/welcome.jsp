<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Welcome</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/welcome.css" rel="stylesheet" type="text/css" media="screen" />

  </head>
  
  <body>
  <div id="welcome">
    <p>如果你能看到这个页面，那你一定是我的好基友。在使用前你要注意：</p>
    <p>1)我们的网站在编写过程中，会有各种弱智的不完善问题，请多包涵；</p>
    <p>2)如果你有任何想法或建议，请在我们的建议栏留言给我；</p>
    <p>3)你也看到，我们的界面十分简洁，这是因为我们缺少美工同志。如果你有关于界面的任何想法，请联系我(yingmingfan(at)gmail.com)。</p>
    <br>
    <div id="enter">
    	<a href="index"> >>进入网站</a>
    </div>
    </div>
  </body>
</html>
