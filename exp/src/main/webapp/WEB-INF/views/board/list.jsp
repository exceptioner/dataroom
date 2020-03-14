<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>BoardList</title>
</head>
<body>
<h1>
list

</h1>
<c:forEach var="data" items="${list }">
${data.dscrp }
</c:forEach>
</body>
</html>
