<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Um Simples Print</h1>
<%=session.getAttribute("nomeSolicitacao") %> <br>
<%=session.getAttribute("dataSolicitacao") %>  <br>
<%=session.getAttribute("cidadeSolicitacao") %>  <br>
<%=session.getAttribute("estadoSolicitacao") %> <br>
<%=session.getAttribute("nomeGestor") %> <br>
<%=session.getAttribute("cpfGestor") %> <br>
<%=session.getAttribute("senhaGestor") %> <br>
</body>
</html>