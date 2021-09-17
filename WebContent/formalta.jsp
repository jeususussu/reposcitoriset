<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- import tags (etiquetas  )struts y javascript -->
<%@ taglib prefix="s" uri ="/struts-tags" %>
<%@ taglib prefix="sx" uri ="/struts-dojo-tags" %>

<html>
<head>
<!-- cdn Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<sx:head/>
<body>
	<sx:tabbedpanel id="formAlta">
		<sx:div label="AGREGAR">
			<s:form action = "alta.action" method="post">
				<s:textfield key="nombre" label="NOMBRE " />
				<s:textfield key="correo" label="CORREO " />
				<s:textarea key="comentario" label="COMENTARIO" />
				
				<s:submit vale="Enviar datos" />
				
			</s:form>
		</sx:div>
	
	
	</sx:tabbedpanel>

</body>
</html>