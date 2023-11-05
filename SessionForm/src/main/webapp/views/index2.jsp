<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/5/2023
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <a href="${pageContext.request.contextPath}/form">Back to</a>
      <h3>Hello ${sessionScope.auth}</h3>
</body>
</html>
