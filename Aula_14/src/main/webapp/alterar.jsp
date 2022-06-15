<%@page import="dao.UsuarioDAO"%>
<%@page import= "modelo.Usuario" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar</title>
<%
 Usuario usr = (Usuario)session.getAttribute("usuarioSelecionado");
%>
</head>
<body>
	<h2>Tela de Edição</h2>
	<div>
	<form action="AlterarUsuarioServlet" method="POST">
	
		<input type="hidden" name="id" id="id" value="<%=usr.getId() %>"/>
	
		<label>Nome: </label>
		<input type= "text" name="nome" id="nome" placeholder="Nome Completo" size="40" value="<%=usr.getNome()%>"/><br>
		
		<label>Usuario: </label>
		<input type= "text" name="usuario" id="usuario" placeholder="Login para usuario" size="20" value="<%=usr.getUsuario()%>"/><br>
		
		<label>Senha: </label>
		<input type= "password" name="senha" id="senha" placeholder="Nome do usuario" size="20" value="<%=usr.getSenha()%>"/><br>
		
		<input type="submit" value="Alterar!">
	</form>
	</div>
	
	<div>
			<nav>
				<ul>
					<li><a href="menu.jsp">Home</a></li>
				</ul>
			</nav>
		</div>
</body>
</html>