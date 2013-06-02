<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<script src="ckeditor/ckeditor.js"></script>

</head>
	<body>
		<form action="sample_posteddata.jsp" method="get">
			<p>
				<label for="editor1">Editor 1:</label>
				<textarea  class="ckeditor" cols="80" id="editor1" name="editor1" rows="10"></textarea>
			</p>
			<p>
				<input type="submit" value="Submit" />
			</p>
		</form>
	</body>	
</html>