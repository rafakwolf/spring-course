<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOC-TYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Flights</title>
</head>
<body>
<div>
    <h2>Flights:</h2>
</div>
<div>
    <table>
        <tr>
            <th>Airlines</th>
            <th>Departure City</th>
            <th>Arrival City</th>
            <th>Departure Time</th>
        </tr>
        <c:forEach items="${flights}" var="flight">
            <tr>
                <td>${flight.operating_airlines}</td>
                <td>${flight.departure_city}</td>
                <td>${flight.arrival_city}</td>
                <td>${flight.estimated_departure_time}</td>
                <td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>