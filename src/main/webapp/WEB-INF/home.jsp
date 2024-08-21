<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>JSP HOME PAGE</h1>
  <p>Je peux calculer 6 x 9 en jsp = ${ 6*9 }</p>
  <h2>Hello ${!empty name ? name:'' } ${noms[0] }</h2>
  
  <h1>Hello ${auteur.nom} ${auteur.actif ? 'vous êtes très actif':'pas actif' }</h1>
  
</body>
</html>