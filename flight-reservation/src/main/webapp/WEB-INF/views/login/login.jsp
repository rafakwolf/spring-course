<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOC-TYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<div>
    <h2>User Login:</h2>
</div>
<form action="login" method="POST">
    <div>
        User Name: <input type="email" name="email"/>
    </div>
    <div>
        Password: <input type="password" name="password"/>
    </div>
    <div>
        <input type="submit" value="Login"/>
    </div>

    <div>
        <span>
            ${msg}
        </span>
    </div>
</form>
</body>
</html>