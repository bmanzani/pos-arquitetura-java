<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Equipamentos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Equipamentos: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Código</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Level</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="equipamentos" items="${listagem}">
					<tr>
						<td>${equipamentos.id}</td>
						<td>${equipamentos.codigo}</td>
						<td>${equipamentos.nome}</td>
						<td>${equipamentos.valor}</td>
						<td>${equipamentos.level}</td>
						<td><a href="/equipamento/${equipamentos.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>