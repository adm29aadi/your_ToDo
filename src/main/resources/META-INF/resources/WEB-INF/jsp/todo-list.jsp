<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>
Todo-List page
</title>
</head>
<body>
<p1>you are most welcome on Todo-List!</p1>
<table>
<thead>
 <td>id</td>
 <td>username</td>
 <td>description</td>
 <td>target</td>
 <td>status</td>
</thead>
<tbody>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.id}</td>
 <td>${item.username}</td>
 <td>${item.description}</td>
 <td>${item.target}</td>
 <td>${item.status}</td>
 <td><a href="http://localhost:8080/delete-todo?id=${item.id}">
 <button>
 Delete${item.id}
 </button>
 </a></td>
 <td><a href="http://localhost:8080/update-todo?id=${item.id}">
 <button>
 update${item.id}
 </button>
 </a></td>
</tr>
</c:forEach> 

/<tbody>
</table>

<p><a href="http://localhost:8080/add-todo">Add Todo</a></p>
</body>
</html>