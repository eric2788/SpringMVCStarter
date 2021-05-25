<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Eric Lam
  Date: 4/23/2021
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Spring MVC!</title>
    <%@include file="../parts/meta.jsp"%>
</head>
<body>
<%@include file="../parts/header.jsp"%>
   <h3>Items</h3>
   <ul>
       <c:forEach var="item" items="${items}">
           <li>Name: ${item.name}, Price: $${item.price}</li>
       </c:forEach>
   </ul>
</body>
</html>
