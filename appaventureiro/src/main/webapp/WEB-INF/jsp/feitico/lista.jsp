<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Feiticos</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h3>Feitiço: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Código</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Level</th>
					<th>Consumível</th>
					<th>Quantidade de mana</th>
					<th>Elemento</th>
					<th>Classe</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="feiticos" items="${listagem}">
					<tr>
						<td>${feiticos.id}</td>
						<td>${feiticos.codigo}</td>
						<td>${feiticos.nome}</td>
						<td>${feiticos.valor}</td>
						<td>${feiticos.level}</td>
						<td>${feiticos.consumivel}</td>
						<td>${feiticos.qtdemana}</td>
						<td>${feiticos.elemento}</td>
						<td>${feiticos.classe}</td>
						<td><a href="/feitico/${feiticos.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>