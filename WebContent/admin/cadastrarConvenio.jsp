<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cadastrar Convênio</title>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/style.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.js"></script>
<script src="bootstrap/js/jquery.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<div class="navbar-brand navbar-center hidden-xs hidden-sm">
			<a href="#">Painel Administrador</a>
		</div>

		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-left">
				<li><a href="#">Smart Clinic</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a
					href="${pageContext.request.contextPath}/admin/index.jsp">Início</a></li>
				<li><a href="#contact">Opções</a></li>
				<li><a href="#about">Perfil</a></li>
				<li><a href="#contact">Ajuda</a></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid" style="margin-top: 15px;">

		<div class="btn-group">
			<button type="button" class="btn btn-default">Agenda</button>
			<button type="button" class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				<span class="caret"></span> <span class="sr-only">Toggle
					Dropdown</span>
			</button>

			<ul class="dropdown-menu" role="menu">
				<li><a href="#">Marcar compromisso</a></li>
				<li><a href="#">Editar compromisso</a></li>
				<li><a href="#">Excluir compromisso</a></li>

				<li class="divider"></li>
				<li><a href="#">Ver compromissos</a></li>
			</ul>
		</div>

		<div class="btn-group">
			<button type="button" class="btn btn-default">Cadastrar</button>
			<button type="button" class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				<span class="caret"></span> <span class="sr-only">Toggle
					Dropdown</span>
			</button>

			<ul class="dropdown-menu" role="menu">
				<li><a
					href="${pageContext.request.contextPath}/admin/cadastrarPessoa.jsp">Pessoa</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/cadastrarSecretaria.jsp">Secretária</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/cadastrarMedico.jsp">Médico</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/cadastrarConvenio.jsp">Convênio</a></li>

				<li class="divider"></li>
				<li><a href="#">Administrador</a></li>
			</ul>
		</div>

		<div class="btn-group">
			<button type="button" class="btn btn-default">Editar</button>
			<button type="button" class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				<span class="caret"></span> <span class="sr-only">Toggle
					Dropdown</span>
			</button>

			<ul class="dropdown-menu" role="menu">
				<li><a href="#">Pessoa</a></li>
				<li><a href="#">Secretária</a></li>
				<li><a href="#">Médico</a></li>
				<li><a href="#">Convênio</a></li>

				<li class="divider"></li>
				<li><a href="#">Administrador</a></li>
			</ul>
		</div>

		<div class="btn-group">
			<button type="button" class="btn btn-default">Deletar</button>
			<button type="button" class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				<span class="caret"></span> <span class="sr-only">Toggle
					Dropdown</span>
			</button>

			<ul class="dropdown-menu" role="menu">
				<li><a href="#">Pessoa</a></li>
				<li><a href="#">Secretária</a></li>
				<li><a href="#">Médico</a></li>
				<li><a href="#">Convênio</a></li>

				<li class="divider"></li>
				<li><a href="#">Administrador</a></li>
			</ul>
		</div>
	</div>

	<div id="main" class="container-fluid">
		<h3 class="page-header">Cadastrar Convênio</h3>

		<form action="${pageContext.request.contextPath}/CadastrarConvenio"
			method="post">

			<div class="row">
				<div class="form-group col-md-3">
					<label for="campo1">Nome</label> <input type="text"
						class="form-control" name="nome" id="nome">
				</div>

				<div class="form-group col-md-2">
					<label for="campo2">CNPJ</label> <input type="text"
						class="form-control" name="CNPJ" id="CNPJ">
				</div>

				<div class="form-group col-md-2">
					<label for="campo3">Endereço</label> <input type="text"
						class="form-control" name="endereco" id="endereco">
				</div>

				<div class="form-group col-md-2">
					<label for="campo4">Telefone</label> <input type="text"
						class="form-control" name="telefone" id="telefone">
				</div>

			</div>

			<hr />
			<div id="any" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Cadastrar</button>
					<a href="${pageContext.request.contextPath}/admin/index.jsp"
						class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
	</div>

</body>
</html>