<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Form</h2>

	<form:form action="processForm" modelAttribute="student">
	
		First name : <form:input path="firstName"/>
		<br>
		Last name : <form:input path="lastName"/>
		<br>
		Country : <form:select path="country">
			<form:options items="${student.coutryList}"/>
			
		</form:select>
		
		<input type="submit" value="send">
	
	</form:form>

</body>
</html>