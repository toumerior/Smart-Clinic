<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Gravar Compromisso</title>

 <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <link href="bootstrap/css/style.css" rel="stylesheet">
</head>
<body>

 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid"> <!-- Ajusta a barra na dimensão da tela! -->
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
     <li><a href="#">Início</a></li>
     <li><a href="#">Opções</a></li>
     <li><a href="#">Perfil</a></li>
     <li><a href="#">Ajuda</a></li>
    </ul>
   </div>
  </div>
 </nav>
 
 <div id="main" class="container-fluid">
  <h3 class="page-header">Compromisso (Protótipo)</h3>
  <form action="${pageContext.request.contextPath}/Compromisso" method="post">
    
   <div class="row">
    <div class="form-group col-md-2">
     <label for="campo1">Código do médico</label>
     <input type="text" class="form-control" name="medico_id" id="medico_id">
    </div>
 
    <div class="form-group col-md-4">
     <label for="campo2">Data do compromisso</label>
     <input type="text" class="form-control" name="data_compromisso" id="data_compromisso">
    </div>
 
    <div class="form-group col-md-2">
     <label for="campo3">Hora inicial</label>
     <input type="text" class="form-control" name="hora_inicial" id="hora_inicial">
    </div>
    
    <div class="form-group col-md-2">
     <label for="campo4">Hora final</label>
     <input type="text" class="form-control" name="hora_final" id="hora_final">
    </div>
   </div>
   
    <div class="form-group col-md-2">
     <label for="campo5">Observação</label>
     <input type="text" class="form-control" name="observacao" id="observacao" value="Valor">
    </div>
    
    <hr />

    <div id="any" class="row">
      <div class="col-md-12">
        <button type="submit" class="btn btn-primary">Salvar</button>
        <a href="GravarCompromisso.jsp" class="btn btn-default">Cancelar</a>
      </div>
    </div>
  </form>
  
 </div> 
 
 <script src="bootstrap/js/jquery.min.js"></script>
 <script src="bootstrap/js/bootstrap.min.js"></script>
 
</body>
</html>