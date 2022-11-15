<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Pedidos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Pedidos : ${listagem.size()}</h3>
		
		<h4><a href="/pedido">Novo pedido</a></h4>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descrição</th>
					<th>Data</th>
					<th>Encomenda</th>
					<th>Aventureiro</th>
					<th>Equipamentos</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pedidos" items="${listagem}">
					<tr>
						<td>${pedidos.id}</td>
						<td>${pedidos.descricao}</td>
						<td>${pedidos.data}</td>
						<td>${pedidos.encomenda}</td>
						<td>${pedidos.aventureiro.nome}</td>
						<td>${pedidos.equipamentos.size()}</td>
						<td><a href="/pedido/${pedidos.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>