<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prueba</title>
</head>
<body>
<h1>FORMULARIO @VALID</h1>
<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="product">
	<label>Nombre del producto:</label><form:input type="text" name="name" path="name"/><br>
	<form:errors path="name" cssStyle="color:#E81505"></form:errors><br>
	<label>Marca del producto:</label><form:input type="text" name="marca" path="marca"/><br>
	<form:errors path="marca" cssStyle="color:#E81505"></form:errors><br>
	<label>Descripcion del producto:</label><form:input type="text" name="desc" path="desc"/><br>
	<form:errors path="desc" cssStyle="color:#E81505"></form:errors><br>
	<label>Categoria del producto:</label><form:input type="text" name="cat" path="cat"/><br>
	<form:errors path="cat" cssStyle="color:#E81505"></form:errors><br>
	<label>Precio del producto:</label><form:input type="number" step="0.01" name="price" path="price"/><br>
	<form:errors path="price" cssStyle="color:#E81505"></form:errors><br>
	<label>Fecha de vencimiento:</label><form:input type="date" name="vdate" path="vdate" placeholder="dd/MM/yyyy"/><br>
	<form:errors path="vdate" cssStyle="color:#E81505"></form:errors><br>
	<input type="submit" value="Agregar Producto">
</form:form>
</body>
</html>