<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View Shares</title>

    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>S.No</th>
                    <th>ShareName</th>
                    <th>BuyingDate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${shares}" var="share">
                    <tr>
                        <td>${share.id}</td>
                        <td>${share.shareName}</td>
                        <td>${share.bDate}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>