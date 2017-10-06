<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="../js/jquery.ocupload-1.1.2.js"></script>

<title>OCUpload一鍵上傳</title>

</head>
<body>
	<input type="button" name="uploadButton" id="uploadButton" value="一鍵上傳">
	<script>
	$(function(){
		$("#uploadButton").upload({
			name : 'uploadButton',//后台接收的属性名 上传组件的name属性，即<input type='file' name='file'/>
			action : 'abc.action',//向服务器请求的路径
			enctype : 'multipart/form-data',//mime类型，默认即可
			params : {},//请求时额外传递的参数，默认为空
			autoSubmit : true,//是否自动提交，即当选择了文件，自动关闭了选择窗口后，是否自动提交请求。
			onSubmit : function() {
				alert(123);
			},//提交表单之前触发事件
			onComplete : function(data, self, element) {
				alert(data);
				alert(self);
				alert(element)
			},//提交表单完成后触发的事件
			onSelect : function() {
				alert(1);
			}//当用户选择了一个文件后触发事件
		});
	});
	</script>

</body>
</html>