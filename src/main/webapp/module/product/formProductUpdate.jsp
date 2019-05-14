<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html; charset=iso-8859-1"
	pageEncoding="iso-8859-1"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="iso-8859-1">
<title>Product Update</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>

<body>

	<div class="container">

		<form:form var="product" items="${productUpdate}"
			action="/product/update/${product.id}" method="POST"
			modelAttribute="productUpdate">

			<h2 class="form-signin-heading">Atualizar produto</h2>

			<div class="form-group">
				<form:input type="hidden" path="id" class="form-control"
					value="${product.id}"></form:input>
			</div>

			<spring:bind path="name">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="text" path="name" class="form-control"
						value="${product.name}" autofocus="true"></form:input>
					<form:errors path="name"></form:errors>
				</div>
			</spring:bind>

			<spring:bind path="description">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="text" path="description" class="form-control"
						value="${product.description}" autofocus="true"></form:input>
					<form:errors path="description"></form:errors>
				</div>
			</spring:bind>


			<button class="btn btn-lg btn-primary btn-block" type="submit">Atualizar</button>
		</form:form>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
