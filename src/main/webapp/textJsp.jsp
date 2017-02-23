<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="International.Persion" %><%--
  Created by IntelliJ IDEA.
  User: housh
  Date: 2017/2/23
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);
    Persion p1 = (Persion) ctx.getBean("p");
    Persion p2 = (Persion) ctx.getBean("p");
    out.println((p1 == p2) + "<br/>");
    out.println(p1);
%>

</body>
</html>
