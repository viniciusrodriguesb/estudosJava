<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar</title>
</head>
<body>
	<h2>Tela de Inclusão</h2>
	<div>
	<form action="IncluirUsuarioServlet" method="POST">
		<label>Nome: </label>
		<input type= "text" name="nome" id="nome" placeholder="Nome Completo" size="40"/><br>
		
		<label>Usuario: </label>
		<input type= "text" name="usuario" id="usuario" placeholder="Login para usuario" size="20"/><br>
		
		<label>Senha: </label>
		<input type= "password" name="senha" id="senha" placeholder="Nome do usuario" size="20"/><br>
		
		<input type="submit" value="Cadastrar!">
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