<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Sign Up</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <style type="text/css">
      .errormsg {
        color: red;
      }
    </style>
</head>
<body>
<div class="container">
    <h2 align="center" class="text-primary">validation demo</h2>
    <hr/>
    <div></div>

    <form:form action="register" method="POST" modelAttribute="memberDto">
        <div class="form-group">
            <label>ID :</label>
            <form:input path="id" size="30" cssClass="form-control"
                        placeholder="Enter ID"/>
            <small><form:errors path="id" cssClass="errormsg"/></small>
        </div>
        <div class="form-group">
            <label>Password:</label>
            <form:password path="pw" size="30" cssClass="form-control"
                           placeholder="Enter password"/>
            <small><form:errors path="pw" cssClass="errormsg"/></small>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">검증</button>
        </div>
    </form:form>
</div>
</body>
</html>