<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer registration from</title>
    <style>
        .error {
            color: red;
        }

    </style>
</head>
<body>
<div id="main-form">
    <h1>Customer Register Form</h1> <br>
    <p>* 필수항목</p>
    <form:form action="processForm" modelAttribute="customer">
        First Name : <form:input path="firstName"/>
        <br><br>

        Last Name(*) : <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>

        Free passed : <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>

        PostalCode : <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br><br>

        Email : <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
        <br><br>

        <input type="submit" value="submit"/>
    </form:form>
</div>
</body>
</html>
