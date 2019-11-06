<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="liste" class="ArrayList" scope="request" />
	
	<c:out value="${liste}" default=""/>}}
	

	

</body>
</html>
