<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-12-24
  Time: 오전 6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" />


</body>
</html>
