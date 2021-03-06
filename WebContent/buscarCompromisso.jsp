<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*, data_access_object.CompromissoMedicoDAO, modelo.CompromissoMedico"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CRUD com Bootstrap 3</title>

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
				<li><a href="${pageContext.request.contextPath}/admin/cadastrarCompromisso.jsp">Marcar compromisso</a></li>
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

	<div id="main" class="container-fluid" style="margin-top: 50px">
 
 	<div id="top" class="row">
		<div class="col-sm-3">
		</div>
		<div class="col-sm-6">
			
			<div class="input-group h2">
				<input name="data[search]" class="form-control" id="search" type="text" placeholder="Pesquisar Itens">
				<span class="input-group-btn">
					<button class="btn btn-primary" type="submit">
						<span class="glyphicon glyphicon-search"></span>
					</button>
				</span>
			</div>
			
		</div>
		<div class="col-sm-3">
			<a href="${pageContext.request.contextPath}/admin/cadastrarCompromisso.jsp" class="btn btn-primary pull-right h2">Novo Compromisso</a>
		</div>
	</div> <!-- /#top -->
	</div>
			
			
	

	<div id="main" class="container-fluid">
		<h3 class="page-header">Compromissos Agendados</h3>
		<table class="table table-striped">
			<thead>
				<tbody>
				<tr>
					<th>ID</th>
					<th>Data</th>
					<th>Hora Inicial</th>
					<th>Hora Final</th>
					<th>M�dico</th>
					<th>Observa��o</th>
					<th class="actions">A��es</th>
				</tr>
			</thead>
			<%
				CompromissoMedicoDAO dao = new CompromissoMedicoDAO();
				List<CompromissoMedico> compromissos = dao.buscarCompromisso(1);

				for (CompromissoMedico compromisso : compromissos) {
			%>
			<tr>
				<td><%=compromisso.getCompromisso_id()%></td>
				<td><%=compromisso.getData_compromisso()%></td>
				<td><%=compromisso.getHora_inicial()%></td>
				<td><%=compromisso.getHora_final()%></td>
				<td><%=compromisso.getMedico_id()%></td>
				<td><%=compromisso.getObservacao()%></td>
				<td class="actions">
						<a class="btn btn-success btn-xs" href="view.html">Visualizar</a>
						<a class="btn btn-warning btn-xs" href="${pageContext.request.contextPath}/admin/cadastrarCompromisso.jsp=?<%=compromisso.getCompromisso_id()%>">Editar</a>
						<a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
					</td>
			</tr>
			<%
				}
			%>
			</tbody>
		</table>
	</div> <!-- LISTA -->
	
	<div id="bottom" class="row">
		<div class="col-md-12">
			<ul class="pagination">
				<li class="disabled"><a>&lt; Anterior</a></li>
				<li class="disabled"><a>1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li class="next"><a href="#" rel="next">Pr�ximo &gt;</a></li>
			</ul><!-- /.pagination -->
		</div>
	</div> <!-- /#bottom -->
	
	<!-- Modal -->
<div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modalLabel">Excluir Item</h4>
      </div>
      <div class="modal-body">
        Deseja realmente excluir este item?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Sim</button>
	<button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
      </div>
    </div>
  </div>
</div>
 

</body>
</html>