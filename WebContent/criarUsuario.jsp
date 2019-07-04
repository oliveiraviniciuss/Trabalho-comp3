<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>Sistema de Gerenciamento de Museus do Duarte - Criar Gestor</title>
</head>
<body>
	<h1>Criar usuário</h1>
	<form action="/SistemaMuseuComp3/CriarUsuarioServlet" method="post">
		Nome: <input type="text" name="nome"> <br/>
		CPF: <input type="text" name="cpf"> <br/>
		Senha: <input type="password" name="senha"> <br/>
		<input type="submit" value = "Insere" name="comando">
	</form>
</body>
</html>
