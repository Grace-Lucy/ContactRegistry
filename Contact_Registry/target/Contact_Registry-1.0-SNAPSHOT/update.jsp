<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>

    <h1>Update User</h1>
    <form action="Updateuser" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="${user.id}">
        
        <label>Full Name:</label>
        <input type="text" name="fullname" value="${user.fullname}" required><br><br>
        
        <label>Phone:</label>
        <input type="text" name="phone" value="${user.phone}" required><br><br>
        
        <label>Email:</label>
        <input type="email" name="email" value="${user.email}" required><br><br>
        
        <label>ID Number:</label>
        <input type="text" name="idnumber" value="${user.idnumber}" required><br><br>
        
        <label>Date of Birth: <label/>
            <input type="date" name="dob" required /><br><br>
        
        <label>Gender:</label>
        <input type="radio" name="gender" value="Male" required> Male 
            <input type="radio" name="gender" value="Female" required> Female <br>
        
        <label>County:</label>
        <input type="text" name="county" value="${user.county}" required><br><br>
        
        <input type="submit" value="Update User">
        <a href="user?action=list">Cancel</a>
    </form>

