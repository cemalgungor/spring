<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hosgeldiniz.
 <h3 id="output_header" class="text-success"> <%= request.getAttribute("output") %></h3>
  <c:url var="validateUrl" value="/user/logout"/>
<form id="logout"  action="logout" method="GET">
  <button id="logout" type="submit">logout </button>
</form>
</body>
</html>