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
      
      
       <%
         for(int i=0; i<10;i++){
        	 out.println("la ligne numéro :<br />" +i+1);
         }
      %>
      
       <%
        String heure=(String ) request.getAttribute("heure");
        if(heure.equals("jour")){
        	out.println("Bonjour");
        }else{
        	out.println("Bonsoir");
        }
      %>
  </p>
</body>
</html>