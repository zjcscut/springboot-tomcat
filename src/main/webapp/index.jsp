<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="<%=request.getContextPath()%>/hello.html" method="get">
    <input name="name" id="name" value="">
    <button id="submit" type="submit">提交</button>
</form>
</body>
</html>
