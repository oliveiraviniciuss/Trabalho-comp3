<%@ page import="persistencia.mt.SolicitacaoMuseuMT" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sistema Comp3</title>
    <style>
        #tabela-solicitacoes tr > *:nth-child(1)
        {
            display: none;
        }
    </style>
</head>
<body>
    <table id="tabela-solicitacoes">
        <tr>
          
            <th>Nome</th>
            <th>Data de criação</th>
            <th>Cidade</th>
            <th>CPF do gestor</th>
        </tr>

        <%
            List<SolicitacaoMuseuMT> solicitacoes = (List<SolicitacaoMuseuMT>) request.getAttribute("solicitacoes");
            for (SolicitacaoMuseuMT solicitacao : solicitacoes) {
        %>
        <tr>
            <td>
                <form id="solicitacao-<%= solicitacao.getNome() %>-form" action="criar-museu" method="post">
                    <input type="hidden" name="id" value="<%= solicitacao.getId() %>"/>
                    <input type="hidden" name="cmd" value="Verifica"/>
                </form>
            </td>
            <td><%= solicitacao.getNome() %></td>
            <td><%= solicitacao.getDataCriacao() %></td>
            <td><%= solicitacao.getCidade() %></td>
            <td><%= solicitacao.getCpfGestor() %></td>
            <td><input type="submit" value="Criar" form="solicitacao-<%= solicitacao.getId() %>-form"/></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
