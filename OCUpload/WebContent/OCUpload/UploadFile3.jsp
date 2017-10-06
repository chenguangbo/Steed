<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form target="uploadFile" id="uploadFile" action="./OCUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="uploadFile" onchange="doSubmit()" />
	</form>
	<script>
	
	function doSubmit(){
	document.getElementById("uploadFile").submit();
	}
	</script>
	<iframe name="uploadFile"  style="display:none"></iframe>

</body>
</html>