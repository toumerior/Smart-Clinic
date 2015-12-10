<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Smart Clinic</title>

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
					href="${pageContext.request.contextPath}/admin/index.jsp">In�cio</a></li>
				<li><a href="#contact">Op��es</a></li>
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
					href="${pageContext.request.contextPath}/admin/cadastrarSecretaria.jsp">Secret�ria</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/cadastrarMedico.jsp">M�dico</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/cadastrarConvenio.jsp">Conv�nio</a></li>

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
				<li><a href="#">Secret�ria</a></li>
				<li><a href="#">M�dico</a></li>
				<li><a href="#">Conv�nio</a></li>

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
				<li><a href="#">Secret�ria</a></li>
				<li><a href="#">M�dico</a></li>
				<li><a href="#">Conv�nio</a></li>

				<li class="divider"></li>
				<li><a href="#">Administrador</a></li>
			</ul>
		</div>
	</div>

	<!-- ********************************************************************************************* -->

	<div id="main" class="container-fluid">
		<h3 class="page-header">Marcar Compromisso</h3>

		<form action="${pageContext.request.contextPath}/Compromisso"
			method="post">

			<div class="row">
				<div class="form-group col-md-2">
					<label for="campo1">C�digo do m�dico</label> <input type="text"
						class="form-control" name="medico_id" id="medico_id">
				</div>

				<div class="form-group col-md-4">
					<label for="campo2">Data do compromisso</label> <input type="text"
						class="form-control" name="data_compromisso" id="data_compromisso">
				</div>

				<div class="form-group col-md-2">
					<label for="campo3">Hora inicial</label> <input type="text"
						class="form-control" name="hora_inicial" id="hora_inicial">
				</div>

				<div class="form-group col-md-2">
					<label for="campo4">Hora final</label> <input type="text"
						class="form-control" name="hora_final" id="hora_final">
				</div>
			</div>

			<div class="form-group col-md-6">
				<label for="campo5">Observa��o</label> <input type="text"
					class="form-control" name="observacao" id="observacao">
			</div>

			<div id="any" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Salvar</button>
					<a href="${pageContext.request.contextPath}/admin/index.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
	</div>




</body>
</html>