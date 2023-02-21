<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>

<html>

<body>

<h2>Employee  Info</h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br> <br>
    Surame <form:input path="surname"/>
    <br> <br>
    Salary <form:input path="salary"/>
    <br> <br>
    Department <form:input path="department"/>
    <br> <br>
    <input type="submit" value="SAVE">

</form:form>


</body>

</html>