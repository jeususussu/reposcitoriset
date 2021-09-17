<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio</title>
</head>
<body>
	<h1>struts 2:0 : Catalogo  ,Auntetifiacasion de usuriao, validacion  de datos</h1>
	<br>
	<form action="catalogo.action" method="post">
		<button type="submit" class="btn btn-primary">catalogo</button>	
	</form>
	
	<form action="formautetica.jsp" method="post">
		<button type="submit" class="btn btn-danger">Autentifica CUENTA</button>	
	</form>
	
	
	<form action="formalta.jsp" method="post">
		<button type="submit" class="btn btn-success">DAR DE ALTA</button>	
	</form>
	<br>
	
	
</body>
</html>