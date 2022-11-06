<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Aventureiros</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h3>Aventureiros: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Classe</th>
					<th>Level</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="aventureiros" items="${listagem}">
					<tr>
						<td>${aventureiros.id}</td>
						<td>${aventureiros.nome}</td>
						<td>${aventureiros.classe}</td>
						<td>${aventureiros.level}</td>
						<td><a href="/aventureiro/${aventureiros.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>