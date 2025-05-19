<!DOCTYPE html>
<html>
    <head>
        <title>Contact Registry Web App</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    </head>
    <body class="bg-light">
        <div class="container mt-5">
         <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
             <a class="navbar-brand" href="#">Contact Registry</a>
        </div>
         </nav>
            
             <form action="CreateUser" method="post" class="p-4 shadow-lg rounded bg-light">
                <div class="container mt-3">  
                    <label class="form-label">Full Names:</label>
                    <input type="text" class="form-control" name="fullname" required /><br>
                </div>

                <div class="container mt-3">
                    <label class="form-label">Phone Number:</label>
                    <input type="text" class="form-control" name="phone" required /><br>
                </div>

                <div class=" container mt-3">
                    <label class="form-label">Email Address:</label>
                    <input type="email" class="form-control" name="email" required /><br>
                </div>

                <div class="container mt-3">
                    <label class="form-label" >Id Number:</label>
                    <input type="text" class="form-control" name="idnumber" required /><br>
                </div>

                <div class="container mt-3">
                    <label class="form-label">Date of Birth:</label>
                    <input type="date" class="form-control" name="dob" required /><br>
                </div>

                 <div class="mb-3">
                     <label class="form-label d-block">Gender:</label>
                           <div class="form-check form-check-inline">
                        <input type="radio" class="form-check-input" name="gender" value="Male" required />
                <label class="form-check-label">Male</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="gender" value="Female" required />
                <label class="form-check-label">Female</label>
            </div>
     </div>

                <div class="container mt-3">
                    <label class="form-label">County of Residence:</label>
                    <input type="text" class="form-control" name="county" required /><br>
                    </div>
                
                 <div class="text-center">
                    <input type="submit" class="btn btn-success px-5" value="submit"/>
                </div>
                
            </form>
            <footer class="bg-primary text-white text-center py-3 mt-5">
        <div class="container">
            &copy; 2025 Contact Registry. All rights reserved.
        </div>
    </footer>
</div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    </body>
</html>
