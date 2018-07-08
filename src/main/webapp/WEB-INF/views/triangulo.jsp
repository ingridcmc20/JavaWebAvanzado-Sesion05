<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Base de triangulo</title>
</head>
<body>

	<form action="triangulo.html" method="post">
		Base: <input type="text" name="base" value="" /> <br /> 
		Altura: <input type="text" name="altura" value="" /><br /> 
		<input type="submit" value="Calcular" />
	</form>

	<h6>${mensaje}</h6>

</body>
</html>