<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h2>New Releases</h2>
<c:forEach var="book" items="${books}">
    <p>${book.title} by ${book.author}</p>
</c:forEach>

<h2>Trending</h2>
<c:forEach var="book" items="${books}">
    <p>${book.title} by ${book.author}</p>
</c:forEach>
</body>
</html>

