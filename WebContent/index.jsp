<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cookies</title>
</head>
<body>
	<h1>Bienvenido a nuestra web</h1>
	<%
		Object obj = request.getAttribute("fechaPrimeraConexion");
		if(obj != null){
			//Out se utiliza como los servlets cuando queremos pintar.
			out.print("<h2>La fecha de primera conexion es: "+obj+"</h2>");
		}
	%>
</body>
</html>