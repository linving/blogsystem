<%@taglib prefix="s" uri="/struts-tags" %>
<div id="header">
	<div id="logo">
		<h1><s:property value="#session.user.blogName"/></h1>
		<p><a href="#" target="_blank"><s:property value="#session.user.blogDescription"/></a></p>
	</div>
	<div id="navigation">
		<ul>
			
			<li><a href="write_blog.jsp">write blog</a></li>
			<li><a href="showPersonalInfo">personal info</a></li>
		</ul>
	</div>
</div>
