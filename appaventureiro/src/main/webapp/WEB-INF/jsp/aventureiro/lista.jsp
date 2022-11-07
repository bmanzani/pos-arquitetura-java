<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Aventureiros</title>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Aventureiros: ${listagem.size()}</h3>

		<h4>
			<a href="/aventureiro">Novo Aventureiro</a>
		</h4>

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