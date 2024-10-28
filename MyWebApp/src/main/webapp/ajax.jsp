<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="content"></div>
	<script>
		let xhttp = new XMLHttpRequest();
		//console.log(xhttp);
		let url = "/MyWebApp/Hello";
		xhttp.onload = function() {
			//console.log(this.status);
			if (this.status == 200 && this.readyState == 4) {
				//console.log("Hello");
				document.getElementById("content").innerHTML = this.responseText;
			}
		};
		xhttp.open("GET", url, true);
		xhttp.send();
	</script>
</body>
</html>