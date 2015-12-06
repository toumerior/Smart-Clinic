<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, data_access_object.CompromissoMedicoDAO, modelo.CompromissoMedico"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>CRUD com Bootstrap 3</title>

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
    <a class="navbar-brand" href="#">Web Dev Academy</a>
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
  <h3 class="page-header">Compromissos Cadastrados</h3>
    <table>
      <%
      CompromissoMedicoDAO dao = new CompromissoMedicoDAO();
      List<CompromissoMedico> compromissos = dao.Buscar(0);
      
      for (CompromissoMedico compromisso : compromissos) {
      %>
        <tr>
          <td><%=compromisso.getMedico_id() %></td> 
          <td><%=compromisso.getData_compromisso().getTime() %></td>
          <td><%=compromisso.getHora_inicial().getTime() %></td>
          <td><%=compromisso.getHora_final().getTime() %></td>
          <td><%=compromisso.getObservacao() %></td>
        </tr>
      <%
      }
      %>
    </table>  
 </div> 

 <script src="bootstrap/js/jquery.min.js"></script>
 <script src="bootstrap/js/bootstrap.min.js"></script>
 
</body>
</html>