<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List, Model.User" %>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" 
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body class="bg-light">
    <body class="bg-light">
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Contact Registry</a>
            <div>
                <a href="form.jsp" class="btn btn-light">Add New User</a>
            </div>
        </div>
    </nav>

    <div class="container mt-5">
        <h2 class="mb-4 text-center">Registered Users</h2>
    
        <%
            // Retrieve the list of users from the request scope
            List<User> userList = (List<User>) request.getAttribute("userList");
            if (userList != null) {
         %>
    
    <table class="table table-striped table-bordered">
        <thead class="table-primary">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Gender</th>
            <th>County</th>
            <th>Date</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <% for (User user : userList) { %>
        <tr>
            <td><%= user.getFullname() %></td>
            <td><%= user.getEmail() %></td>
            <td><%=user.getPhone()%></td>
            <td><%=user.getGender()%></td>
            <td><%=user.getCounty()%></td>
            <td><%=user.getDob()%></td>
            <td>
               <a href="Edit?id=<%= user.getId() %>">Edit</a> 
               <a href="DeleteUser?id=<%= user.getId() %>">Delete</a>
            </td>
        </tr>
        <% } %>
            </tbody>
            </table>
        <% } else { %>
         <div class="alert alert-info text-center">No users found.</div>
        <% } %>
    </div>

    <footer class="bg-primary text-white text-center py-3 mt-5">
        &copy; 2025 Contact Registry. All rights reserved.
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" 
            integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" 
            crossorigin="anonymous"></script>
</body>
</html>