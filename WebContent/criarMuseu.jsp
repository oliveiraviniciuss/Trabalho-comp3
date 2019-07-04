<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

	<body>
		<h1>Criar Museu</h1>
		<form action="cria-museu" method="post">
			Nome: <input type="text" name="nome"> <br/>
			Data de Criação: <input type="text" name="dataCriacao"> <br/>
			Cidade: <input type="text" name="cidade"> <br/>
			CPF do Gestor: <input type="text" name="cpfGestor"> <br/>
			
			<input type="submit" value = "Insere" name="comando">
		</form>
	</body>  

</html>