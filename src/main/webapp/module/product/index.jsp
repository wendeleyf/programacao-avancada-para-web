<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Create an account</title>
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
	integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<form id="logoutForm" method="POST" action="${contextPath}/logout">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>

			<h3>
				Welcome ${pageContext.request.userPrincipal.name} | <a
					onclick="document.forms['logoutForm'].submit()">Logout</a>
			</h3>
			<p>
				<a href="/product/form">Cadastrar Produto</a>
			</p>
			<p>
				<a href="/product">Listar Produtos</a>
			</p>

			<c:if test="${not empty listProduct}">

				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>Name</th>
							<th>Description</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="product" items="${listProduct}">
							<tr>
								<td>${product.id}</td>
								<td>${product.name}</td>
								<td>${product.description}</td>
								<td><a href="/product/delete/${product.id}"> <i
										class="fa fa-trash"></i>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>

				</table>

			</c:if>




		</c:if>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
