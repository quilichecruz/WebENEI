<%-- 
    Document   : home
    Created on : 06/12/2017, 09:20:23 AM
    Author     : prac-enei5
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin</title>
	<meta charset="utf-8">
        <link rel="stylesheet" href="assets/css/custom/home-admin.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<!-- Compiled and minified CSS -->
  	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
  	<!-- Compiled and minified JavaScript -->
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>  	
</head>
<body>
    <div class="row">
        <div class="col s12 m12 l12">
            <nav class="nav-extended blue">
                <ul class="tabs tabs-transparent">
                    <li class="tab"><a class="active" href="#test1"><i class="material-icons">group</i></a></li>
                    <li class="tab"><a href="#test2"><i class="material-icons">local_library</i></a></li>
                    <li class="tab"><a href="#test3"><i class="material-icons">access_time</i></a></li>
                    <li class="tab"><a href="#test4"><i class="material-icons">equalizer</i></a></li>
                </ul>
            </nav>	
	</div>
        <div id="test1" class="col s12 m12 l12">
            <div class="row" style="background: #ccc">
            <div class="col s12 m12 l12">
                <p class="flow-text">Directorio</p>
            </div>
            
            <div class="col s12 m12 l12" style="background: bisque;width: 100px;height: 100px;">
                <table class="responsive-table highlight bordered" style="background: lemonchiffon;max-height: 100px;">
                    <thead>
                        <tr>
                            <th>Docente</th>
                            <th>Profesión</th>
                            <th>Sede</th>
                            <th>Acción</th>
                        </tr>
                    </thead>
                    <tbody>
<%
    Connection cnx=null;
    Statement sta=null;
    ResultSet rs=null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from profesores order by apellidos_pro");
    while (rs.next()){
%>
                        <tr>
                            <td><%=rs.getString(3)%> <%=rs.getString(2)%></td>
                            <td><%=rs.getString(9)%></td>
                            <td><%=rs.getString(15)%></td>
                            <td>
                                <a class="btn-floating blue" style="width: 20px;height: 20px;"></a>
                                <a class="btn-floating red" style="width: 20px;height: 20px"></a>
                            </td>
                        </tr>
<%
        }
sta.close();
rs.close();
cnx.close();
} catch (Exception e) {
}
%> 
                    </tbody>
                </table>
            </div>
        </div>            
        </div>
        
        
        <div id="test2" class="col s12">
            <blockquote>Cursos</blockquote>
            
            <div class="col-md-12">
                <div class="panel panel-default" style="border: 100px;">
                    <div class="panel-heading" style="border: 100px;">
                        <h3 class="panel-title">Directorio</h3>
                    </div> 
                    <div class="table-responsive size">
                        <table class="table table-hover">                
                                <tr>
                                    <th>DNI</th>
                                    <th>DOCENTE</th>
                                    <th>CORREO</th>
                                    <th>SEDE</th>
                                    <th>PROFESIÓN</th>
                                    <th>GRADO</th>
                                    <th>ACCIÓN</th>
                                </tr>
<%
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from profesores order by apellidos_pro");
    while (rs.next()){
%>
                                <tr>  
                                    <th class="danger mytr mycolor" title="Crear una relación"><a href="relacion.jsp?dnipro=<%=rs.getString(1)%>&nombrepro=<%=rs.getString(2)%>&apellidospro=<%=rs.getString(3)%>"><%=rs.getString(1)%></a></th>
                                    <th class="info mycolor" title="Ver detalle"><a href="home_admin.jsp?dnipro=<%=rs.getString(1)%>#popup2" onclick = "document.getElementById('light2').style.display='block';"><%=rs.getString(3)%>, <%=rs.getString(2)%></a></th>
                                    
                                    <th class="warning mycolor"><%=rs.getString(6)%></th>
                                    <th class="success mytr mycolor"><%=rs.getString(15)%></th>
                                    <th class="info mycolor"><%=rs.getString(9)%></th>
                                    <th class="success mytr mycolor"><%=rs.getString(8)%></th>
                                    <th class="active mytr">
                                        <a href="editpro.jsp?dnipro=<%=rs.getString(1)%>">
                                            <img src="Iconos/editar.png" alt="Editar"></a>
                                        <a href="eliminarpro.jsp?dnipro=<%=rs.getString(1)%>" onclick="return eliminar()">
                                            <img src="Iconos/eliminar1.png" alt="Eliminar"></a>
                                    </th>
                                </tr>                      
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>
                            </table>
                        </div>
                    </div>
                </div> 
            
            
            
            
            
        </div>
        <div id="test3" class="col s12">
            <blockquote>Asistencia</blockquote>
        </div>
        <div id="test4" class="col s12">
            <blockquote>Reportes</blockquote>
        </div>           
    </div>
  
  

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
</body>
</html>