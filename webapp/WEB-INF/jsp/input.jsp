<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Character encoding test page</title>
<script type="text/javascript">
function ur() {
	// alert(encodeURIComponent("ㄱ"));
	var url = "%E3%84%B1";
	location.href = "http://localhost:8080/app?m=" + url;
}
</script>
</head>
<body>
<p>message to app</p>
<form method="POST" action="app">
	<input type="text" name="m">
	<input type="submit" value="Submit" />
	<input type="reset" value="Reset" />
</form>
<p>GET method</p>
<form method="GET" action="app">
	<input type="text" name="m">
	<input type="submit" value="Submit" />
	<input type="reset" value="Reset" />
</form>
<p><a href="#abc" onclick="ur()">link</a></p>
</body>
</html>