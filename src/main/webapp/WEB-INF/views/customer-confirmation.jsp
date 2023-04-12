<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>customer confirmation</title>

<body>
<div>

    The customer is confirmed : ${customer.firstName} ${customer.lastName}

    <br><br>

    Free Passes : ${customer.freePasses}

    <br><br>

    PostalCode: ${customer.postalCode}

    <br><br>

    CourseCode: ${customer.courseCode}

    <br><br>


</div>
</body>
</html>
