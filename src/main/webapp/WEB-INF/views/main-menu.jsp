<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>
      a {
        text-decoration: none;
        color: black;
      }

      a:hover {
        color: blue;
      }
    </style>
</head>
<body>
<h2>Spring Mvc Demo - Home Page</h2>

<hr>

<br>


<a href="${pageContext.request.contextPath}/customer/showForm">Customer form</a>
</body>
</html>
