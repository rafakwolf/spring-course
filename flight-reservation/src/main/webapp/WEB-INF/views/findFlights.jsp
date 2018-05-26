<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOC-TYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Find Flights</title>
</head>
<body>
<div>
    <h2>Find Flights:</h2>
</div>
<div>
    <form action="findFlightsExec" method="POST">
        <div>
            From: <input type="text" name="from"/>
        </div>
        <div>
            To: <input type="text" name="to"/>
        </div>
        <div>
            Departure Date: <input type="text" name="departureDate"/>
        </div>
        <div>
            <input type="submit" value="Search"/>
        </div>
    </form>
</div>
</body>
</html>