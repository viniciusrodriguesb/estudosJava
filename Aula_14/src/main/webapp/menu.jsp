<%@page import="dao.UsuarioDAO"%>
<%@page import="modelo.Usuario" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>

<script>
		function confirmarExclusao(id) {
			var resposta = confirm("Confirma a exclusão?");
					  
			if (resposta == true) {
			window.location.href = "ExcluirUsuarioServlet?id=" + id;
		} 
	}
</script>
</head>
<body>

	<!-- COMO INSERIR NOME DO USUÁRIO QUE LOGOU  -->
<%
	String nome = (String)session.getAttribute("usuarioSession");
%>
	
	<h2> Bem vindo ao sistema, <%=nome%> </h2>
	<div>
		<h2>Lista usuários</h2>
		
	</div>
	<!-- INSERINDO TABELA COM DADOS   -->
	<div>
	<table border=1>
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Usuário</th>
			<th colspan=2></th>
		</tr>
		
		<%
		UsuarioDAO dao = new UsuarioDAO();
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista = dao.listar();
		
		for(Usuario usuario: lista){%>
			<tr>
			<td>
				<%=usuario.getId()%>
			</td>
			<td>
				<%=usuario.getNome()%>
			</td>
			<td>
				<%=usuario.getUsuario()%>
			</td>
			<td>
				<a href="PrepararAlteracaoUsuario?id=<%=usuario.getId()%>"><img src=https://w7.pngwing.com/pngs/740/67/png-transparent-computer-icons-icon-design-edit-angle-computer-data-thumbnail.png width="24px"/></a>
			</td>
			<td>	
				<img src="https://w7.pngwing.com/pngs/953/119/png-transparent-computer-icons-delete-icon-cdr-angle-text.png" width="24px" onclick="confirmarExclusao(<%=usuario.getId()%>)"/>
			</td>	
			</tr>
		<%
		}
		%>
	</table>
		<div>
			<nav>
				<ul>
					<li><a href="cadastro.jsp">Cadastrar Usuário</a></li>
					<li><a href="LogoutServlet">Logout</a></li>
				</ul>
			</nav>
		</div>
	
	</div>
</body>
</html>