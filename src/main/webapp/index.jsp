<%@taglib prefix="csrf" uri="http://tiger/csrf" %>
<%--
  Created by IntelliJ IDEA.
  User: zhoufeng
  Date: 16/5/21
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="/user" method="post">
  <input type="hidden" name="__csrf_token__" value="<csrf:token />" />
    <csrf:hiddenInput />
   <input name="aa" />
  <input type="submit" />
</form>

</body>
</html>
