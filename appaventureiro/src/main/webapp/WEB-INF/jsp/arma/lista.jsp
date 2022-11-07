<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Armas</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Armas: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Código</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Level</th>
					<th>Ranged</th>
					<th>Peso</th>
					<th>Elemento</th>
					<th>Tipo</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="armas" items="${listagem}">
					<tr>
						<td>${armas.id}</td>
						<td>${armas.codigo}</td>
						<td>${armas.nome}</td>
						<td>${armas.valor}</td>
						<td>${armas.level}</td>
						<td>${armas.ranged}</td>
						<td>${armas.peso}</td>
						<td>${armas.elemento}</td>
						<td>${armas.tipo}</td>
						<td><a href="/arma/${armas.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>