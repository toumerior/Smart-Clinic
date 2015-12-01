<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Cadastrar Pessoa</title>

 <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <link href="bootstrap/css/style.css" rel="stylesheet">
</head>
<body>

 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid"> <!-- Ajusta a barra na dimens�o da tela! -->
   <div class="navbar-header">
    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
     <span class="sr-only">Toggle navigation</span>
     <span class="icon-bar"></span>
     <span class="icon-bar"></span>
     <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">Smart Clinic</a>
   </div>
   <div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
     <li><a href="#">In�cio</a></li>
     <li><a href="#">Op��es</a></li>
     <li><a href="#">Perfil</a></li>
     <li><a href="#">Ajuda</a></li>
    </ul>
   </div>
  </div>
 </nav>
 
 <div id="main" class="container-fluid">
  <h3 class="page-header">Cadastrar Paciente</h3>
  <form action="${pageContext.request.contextPath}/CadastrarPaciente" method="post">
    
   <div class="row">
    <div class="form-group col-md-3">
     <label for="campo1">C�digo da pessoa</label>
     <input type="text" class="form-control" name="codPessoa" id="codPessoa">
    </div>
 
    <div class="form-group col-md-2">
     <label for="campo2">C�digo do Conv�nio</label>
     <input type="text" class="form-control" name="codConvenio" id="codConvenio">
    </div>
   </div>
       
    <hr />
    <div id="any" class="row">
      <div class="col-md-12">
        <button type="submit" class="btn btn-primary">Cadastrar</button>
        <a href="cadastrarPessoa.jsp" class="btn btn-default">Cancelar</a>
      </div>
    </div>
  </form>
 </div> 
 
 <script src="bootstrap/js/jquery.min.js"></script>
 <script src="bootstrap/js/bootstrap.min.js"></script>
 
</body>
</html>