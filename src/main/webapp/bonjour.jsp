<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><c:if test="${!empty nom}"><p><c:out value="Bonjour ${nom}"></c:out></p></c:if></h1>
  <form method="post" action="Bonjour">
  <label for="nom">Nom:</label>
  <input type="text" id="nom" name="nom"/>
  <input type="submit" />
  </form>
</body>
</html>