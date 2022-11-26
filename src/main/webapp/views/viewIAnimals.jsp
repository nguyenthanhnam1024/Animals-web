<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="../jquery_321/jquery_321/jquery-3.2.1.min.js"></script>
</head>
<body>
<h2>tao ket noi den server</h2>
<button type="button" onclick="loaddata()">click</button>
<div id="output" ></div>
<script type="text/javascript" >

function loaddata(){
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
	    if(xhr.readyState === XMLHttpRequest.DONE ){
		    document.getElementById('output').innerHTML += xhr.responseText + `<h2>tao ket noi den server</h2>
		    <button type="button" onclick="loaddata()">click</button>
		    `;
	    }
   };
   xhr.open('GET', '/Animals/ServletSelectAllImageAnimals?t='+Math.random())
   xhr.send();
}

</script>

</body>
</html>