<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>* TEAM *</title>
</head>
<body>${message}
<<h1>Edit team page</h1>
<p>Here you can edit the existing team.</p>
<p>${message}</p>
<form:form method="POST" commandname="team" action="${pageContext.request.contextPath}/pages/team/edit/${team.id}.html">
<table>
<tbody>
	<tr>
		<td>Name:</td>
		<td><form:input path="name"></form:input></td>
	</tr>
	<tr>
		<td>Rating:</td>
		<td><form:input path="rating"></form:input></td>
	</tr>
	<tr>
		<td><input value="Edit" type="submit"></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

</body>
</html>