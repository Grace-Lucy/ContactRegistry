<%@ page import="Model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    User user = (User) request.getAttribute("user");
    if (user == null){
    out.println("User not Found.");
    return;
    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List, Model.User" %>

<!DOCTYPE html>
<%@ page import="Model.User" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" 
          rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="text-center mb-4">Edit User Details</h2>
        <form action="update" method="post" class="p-4 bg-white shadow rounded">

            <input type="hidden" name="id" value="<%= user.getId() %>" />

            <div class="mb-3">
                <label class="form-label">Full Name:</label>
                <input type="text" name="fullname" class="form-control" value="<%= user.getFullname() %>" required />
            </div>

            <div class="mb-3">
                <label class="form-label">Phone:</label>
                <input type="text" name="phone" class="form-control" value="<%= user.getPhone() %>" required />
            </div>

            <div class="mb-3">
                <label class="form-label">Email:</label>
                <input type="email" name="email" class="form-control" value="<%= user.getEmail() %>" required />
            </div>

            <div class="mb-3">
                <label class="form-label">ID Number:</label>
                <input type="text" name="idnumber" class="form-control" value="<%= user.getIdnumber() %>" required />
            </div>

            <div class="mb-3">
                <label class="form-label">Date of Birth:</label>
                <input type="date" name="dob" class="form-control" value="<%= user.getDob() %>" required />
            </div>

            <div class="mb-3">
                <label class="form-label">Gender:</label>
                <select name="gender" class="form-select" required>
                    <option value="Male" <%= user.getGender().equals("Male") ? "selected" : "" %>>Male</option>
                    <option value="Female" <%= user.getGender().equals("Female") ? "selected" : "" %>>Female</option>
                </select>
            </div>

            <div class="mb-4">
                <label class="form-label">County:</label>
                <input type="text" name="county" class="form-control" value="<%= user.getCounty() %>" required />
            </div>

            <div class="text-center">
                <input type="submit" value="Update User" class="btn btn-primary px-4" />
                <a href="ListUsers" class="btn btn-secondary px-4 ms-2">Cancel</a>
            </div>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
            crossorigin="anonymous"></script>
</body>
</html>
