<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>tiene: <c:out value="${todos.size()}" /> elementos</p>
        <ul>
        <c:forEach var="datos" items="${todos}">
            <li>
                <p><c:out value="${datos.id}" /></p>
                <p> <c:out value="${datos.name}" /></p>
            </li>

            
        </c:forEach>
        </ul>

    </body>
</html>
