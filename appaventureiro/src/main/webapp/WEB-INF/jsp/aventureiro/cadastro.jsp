<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Aventureiro</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<form action="aventureiro/cep" class="form-inline" method="post">

			<div class="form-group">
				<label>CEP:</label> <input type="text" class="form-control"
					placeholder="Entre com o seu CEP" name="cep">
			</div>

			<button type="submit" class="btn btn-default">Buscar</button>
		</form>

		<h2>Aventureiro</h2>

		<form action="/aventureiro/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o seu nome" name="nome">
			</div>
			<div class="form-group">
				<label>Classe:</label> <input type="text" class="form-control"
					placeholder="Entre com a sua classe" name="classe">
			</div>
			<div class="form-group">
				<label>Level:</label> <input type="text" class="form-control"
					placeholder="Entre com o seu Level" name="level">
			</div>

			<c:import url="/WEB-INF/jsp/endereco.jsp" />

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>