<%-- <%@page import="br.com.everton.testecrud.pojo.Usuario" %> --%>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="800">

	<tr> 
		<td width="40%"> Nome </td>
		<td width="40%"> Login</td>
		<td width="20%"> Senha</td>
	</tr>


	<!--Inicio laço -->
	
	<c:forEach items="${Usu}" var="usuario">
	
	<tr> 
		<td width="40%">"${usuario.nome}"</td>
		<td width="40%">usuario.login</td>
		<td width="20%">usuario.senha</td>
	</tr>

	<!--Fim laço -->
	</c:forEach>
</table>


</body>
</html>