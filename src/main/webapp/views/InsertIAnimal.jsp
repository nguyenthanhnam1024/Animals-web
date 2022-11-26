<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">
    <label for="id">idImage</label>
    <input type="number" id="id" name="id">
    <label for="ten">Ten dong vat</label>
    <input type="text" id="ten" name="ten">
    <label for="url">url</label>
    <input type="text" id="url" name="url">
    <label for="lop">class</label>
    <input type="text" id="lop" name="lop">
    
    <input type="button" value="send" id="send" onclick="senddata()">
    <div id="nhan"></div>
</form>
<script type="text/javascript">
function senddata() {
	var a = document.getElementById('id').value
	var b = document.getElementById('ten').value
	var c = document.getElementById('url').value
	var d = document.getElementById('lop').value
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if(xhr.readyState === XMLHttpRequest.DONE){
			alert("trạng thái = "+xhr.readyState)
			 document.getElementById('nhan').innerHTML = xhr.responseText +`insert thanh cong`
		}		
	}
    xhr.open("GET", "/Animals/views/InsertIAnimal.jsp"+Math.random())	
    xhr.send();
}


     
 </script>
</body>
</html>