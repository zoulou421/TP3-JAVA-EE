<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Welcome to you JSP page!</h1>
  <p>
     <%
        String variable=(String ) request.getAttribute("variable");
        out.println(variable);
      %>
  </p>
</body>
</html>