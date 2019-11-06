<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<jsp:useBean id="name" class="tp1.Personne" scope="request"/>
<c:out value="${name.GetNom()}" default=""/>
<a href="formBean.html">Retour</a>