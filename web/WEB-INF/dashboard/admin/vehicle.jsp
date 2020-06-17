<%--



&lt;%&ndash;
  Created by IntelliJ IDEA.
  User: brocklife
  Date: 6/13/2020
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
&ndash;%&gt;
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<%
    //    Vehicle aleb = (Vehicle) request.getAttribute("a1");
    Vehicle aleb = (Vehicle) session.getAttribute("alien");
    //(Vehicle) session.getAttribute("a1");
    out.println(aleb);
%>


</body>
</html>
--%>
