<%-- 
    Document   : home
    Created on : 06/12/2017, 09:20:23 AM
    Author     : prac-enei5
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro= request.getParameter("dnipro");
    String nombrepro= request.getParameter("nombrepro");
    String id=request.getParameter("id");
%>
<html>
<head>
	<title>Admin</title>
	<meta charset="utf-8">
        <link rel="stylesheet" href="assets/css/custom/admin-home.css">
        <link rel="stylesheet" href="assets/css/custom/admin-popup.css">
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
                    <li class="tab"><a href="#"><i class="material-icons">home</i></a></li>
                    <li class="tab"><a class="active" href="#test1"><i class="material-icons">group</i></a></li>
                    <li class="tab"><a href="#test2"><i class="material-icons">local_library</i></a></li>
                    <li class="tab"><a href="#test3"><i class="material-icons">access_time</i></a></li>
                    <li class="tab"><a href="#"><i class="material-icons">border_color</i></a></li>
                    <li class="tab"><a href="#test4"><i class="material-icons">equalizer</i></a></li>
                </ul>
            </nav>	
	</div>
        <div id="test1" class="col s12 m12 l12">
            
            <div class="col s2 m2 l2 paddingh">
                <div class="card-panel ">
                    <a href="#">
                    <i class="material-icons"></i></a>
                </div>
            </div>
            <div class="col s10 m10 l10 paddingh">
                <div class="card-panel">
                    <a href="#">
                    <i class="material-icons"></i></a>
                </div>
            </div>
            
            <div class="col s2 m2 l2">
                <ul class="collapsible" data-collapsible="accordion">
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons">school</i>
                            Docentes
                        </div>
                            <div class="collapsible-body"><p>Nuevo Registro</p>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons">local_library</i>
                            Cursos
                        </div>
                            <div class="collapsible-body"><p>Listar</p>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons">access_time</i>
                            Asistencia
                        </div>
                            <div class="collapsible-body"><p>Reportes</p>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons">border_color</i>
                            Notas
                        </div>
                            <div class="collapsible-body"><p>Nuevo Registro</p>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons">equalizer</i>
                            Reportes
                        </div>
                            <div class="collapsible-body"><p>Reportes</p>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">
                            <i class="material-icons">settings</i>
                            Settings
                        </div>
                            <div class="collapsible-body"><p>Configuración.</p>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="col s10 m10 l10">
                <div class="table-responsive size">
                    <table class="highlight tableh">
                        <thead>
                            <tr>
                                <th></th>
                                <th>Docente</th>
                                <th>Profesión</th>
                                <th>Sede</th>
                                <th>Grado</th>
                                <th class="center">Acción</th>
                            </tr>
                        </thead>
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
                        <tbody>
                            <tr>  
                                <td class="center"><a href="#"><i class="material-icons">portrait</i></a>
                                <td class=""><a style="text-decoration: none;color: #000;" href="home.jsp?dnipro=<%=rs.getString(1)%>#popup2" onclick = "document.getElementById('light2').style.display='block';"><%=rs.getString(3)%>, <%=rs.getString(2)%></a></td>
                                <td class=""><%=rs.getString(9)%></td>
                                <td class=""><%=rs.getString(15)%></td>
                                <td class=""><%=rs.getString(8)%></td>
                                <td class="center">
                                    <a href="home.jsp?dnipro=<%=rs.getString(1)%>#popup2" onclick = "document.getElementById('light2').style.display='block';"><i class="material-icons">web</i></a>
                                    <a href="#"><i class="material-icons">colorize</i></a>
                                    <a href="#"><i class="material-icons">highlight_off</i></a>
                                </td>
                            </tr>
                        </tbody>
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
            <div class="col">
            </div>
        </div>
        
        
        <div id="test2" class="col s12">
            <blockquote>Cursos</blockquote>

        </div>
        <div id="test3" class="col s12">
            <blockquote>Asistencia</blockquote>
        </div>
        <div id="test4" class="col s12">
            <blockquote>Reportes</blockquote>
        </div>           
    </div>
    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
    <div class="modal-wrapper" id="popup2">
        <div class="popup-contenedor2"> 
            <div class="row" id="light2" style="display: block;">
                <div class="col s12 m12 l12">
                    <div class="table-responsive">
                        <table class="highlight tableh">    
                            <thead>
                                <tr>
                                    <th class="center">DNI</th>
                                    <th class="center">Apellidos y Nombres</th>
                                    <th class="center">Profesión</th>
                                    <th class="center">Grado</th>
                                    <th></th>
                                </tr>
                            </thead>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("SELECT dni_pro,nombre_pro,apellidos_pro,tele_pro,dire_pro,corr_pro,"
                + "cpre_pro,grad_pro,prof_pro,tipo_pro,cpos_pro,espe_pro,dipl_pro,expe_pro,sede_pro,"
                + "if(c1 !='null',c1,''), if(c2 !='null',c2,''),"
                + "if(c3 !='null',c3,''), if(c4 !='null',c4,''),"
                + "if(c5 !='null',c5,''), if(c6 !='null',c6,''),"
                + "if(c7 !='null',c7,''), if(c8 !='null',c8,''),"
                + "if(c9 !='null',c9,''), if(c10 !='null',c10,''),"
                + "if(c11 !='null',c11,''), if(c12 !='null',c12,'')"
                + "FROM profesores "
                + "WHERE dni_pro="+dnipro);
        while (rs.next()){
%>
                            <tbody>
                                <tr>
                                    <td class="center"><%=rs.getString(1)%></td>
                                    <td class="center"><%=rs.getString(3)%> <%=rs.getString(2)%></td>
                                    <td class="center"><%=rs.getString(9)%></td>
                                    <td class="center"><%=rs.getString(8)%></td>
                                    <td class="center">
                                        <a href="#"><i class="material-icons">colorize</i></a>
                                        <a href="#"><i class="material-icons">highlight_off</i></a>
                                    </td>
                                </tr>
                                <tr class="">
                                    <td class="" title="Cursos de referencia"><i class="material-icons">import_contacts</i>
                                    </td>
                                    <td colspan="4" class="" title="Cursos de referencia">
                                        <ul style="list-style-type: none; padding: 0px 0px;color: #0069B4">
                                           <li><%=rs.getString(16)%></li>
                                           <li><%=rs.getString(17)%></li>
                                           <li><%=rs.getString(18)%></li>
                                           <li><%=rs.getString(19)%></li>
                                           <li><%=rs.getString(20)%></li>
                                           <li><%=rs.getString(21)%></li>
                                           <li><%=rs.getString(22)%></li>
                                           <li><%=rs.getString(23)%></li>
                                           <li><%=rs.getString(24)%></li>
                                           <li><%=rs.getString(25)%></li>
                                           <li><%=rs.getString(26)%></li>
                                           <li><%=rs.getString(27)%></li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="" title="Especialidad"><i class="material-icons">school</i></td>
                                    <td colspan="4" class="" title="Especialidad"><%=rs.getString(12)%></td>
                                </tr>
                                <tr class="">
                                    <td class="" title="Experiencia"><i class="material-icons">school</i></td>
                                    <td colspan="4" class="" title="Experiencia"><%=rs.getString(14)%></td>
                                </tr>
                                <tr class="">
                                    <td class=""><i class="material-icons">phone</i></td>
                                    <td colspan="4" class=""><%=rs.getString(4)%> - <%=rs.getString(6)%></td>
                                </tr>
                                <tr class="">
                                    <td class=""><i class="material-icons">location_on</i></td>
                                    <td colspan="4" class=""><%=rs.getString(5)%>
                                </tr>
                            </tbody>
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
                            <a class="popup-cerrar2" href="#" title="Cerrar" onclick = "document.getElementById('light2').style.display='none';">x</a>
        </div>
    </div>
  
                            
                            
                            
                            
                            
                            

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
</body>
</html>