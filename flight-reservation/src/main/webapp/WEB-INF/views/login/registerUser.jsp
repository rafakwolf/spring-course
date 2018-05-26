<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOC-TYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register User</title>
</head>
<body>
<div>
    <div>
        <h2>User Registration:</h2>
    </div>
    <form action="registerUser" method="POST">
        <div>
            First Name: <input type="text" name="firstName"/>
        </div>
        <div>
            Last Name: <input type="text" name="lastName"/>
        </div>
        <div>
            User Name: <input type="email" name="email"/>
        </div>
        <div>
            Password: <input type="password" name="password"/>
        </div>
        <div>
            Confirm Password: <input type="password" name="confirmPassword"/>
        </div>
        <div>
            <input type="submit" value="Register"/>
        </div>
    </form>
</div>
</body>
</html>