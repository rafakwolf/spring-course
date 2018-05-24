<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOC-TYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Editing</title>
</head>
<body>

<form action="updateLoc" method="POST">
    <div>
        <label for="id">Id:</label>
        <input type="text" name="id" id="id" value="${location.id}" readonly/>
    </div>
    <div>
        Code: <input type="text" name="code" value="${location.code}"/>
    </div>
    <div>
        Name: <input type="text" name="name" value="${location.name}"/>
    </div>
    <div>
        Type: Urban <input type="radio" name="type" value="URBAN" ${location.type == 'URBAN'? 'checked': ''}/>
        Rural <input type="radio" name="type" value="RURAL" ${location.type == 'RURAL'? 'checked': ''}/>
    </div>
    <div>
        <input type="submit" value="Save">
    </div>
</form>

</body>
</html>