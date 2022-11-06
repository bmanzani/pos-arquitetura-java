<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Armaduras</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h3>Armaduras: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Código</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Level</th>
					<th>Encantada</th>
					<th>Defesa</th>
					<th>Recomendações</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="armaduras" items="${listagem}">
					<tr>
						<td>${armaduras.id}</td>
						<td>${armaduras.codigo}</td>
						<td>${armaduras.nome}</td>
						<td>${armaduras.valor}</td>
						<td>${armaduras.level}</td>
						<td>${armaduras.encantada}</td>
						<td>${armaduras.defesa}</td>
						<td>${armaduras.Recomendacoes}</td>
						<td><a href="/armadura/${armaduras.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>