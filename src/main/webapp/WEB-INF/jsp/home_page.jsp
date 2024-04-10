<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h2>New Releases</h2>
<c:forEach var="book" items="${books}" varStatus="status">
    <c:if test="${status.index == 0}">
        <h3>${book.title}</h3>
        <p>Author: ${book.author}</p>
        <p>Price: ${book.price}</p>
        <p>Description: ${book.description}</p>
        <p>Available: ${book.available ? 'Yes' : 'No'}</p>
        <img src="${book.coverPhotoUrl}" alt="${book.title} Cover" width="150"/>
    </c:if>
</c:forEach>

<h2>Trending</h2>
<c:forEach var="book" items="${books}" varStatus="status">
    <c:if test="${status.index == 1}">
        <h3>${book.title}</h3>
        <p>Author: ${book.author}</p>
        <p>Price: ${book.price}</p>
        <p>Description: ${book.description}</p>
        <p>Available: ${book.available ? 'Yes' : 'No'}</p>
        <img src="${book.coverPhotoUrl}" alt="${book.title} Cover" width="150"/>
    </c:if>
</c:forEach>

</body>
</html>
