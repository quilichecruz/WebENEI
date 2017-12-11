<%-- 
    Document   : inicio
    Created on : 11/12/2017, 10:22:36 AM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="assets/css/custom/inicio-admin.css">
        <link rel="stylesheet" href="assets/css/custom/admin-popup.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">

    </head>
    <body>
        <nav class="nav nav-tabs" id="myTab" >
            <a class="nav-item nav-link" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true" style="color: #000;font-size: 13px;">DOCENTES</a>
            <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false" style="color: #000;font-size: 13px;">CURSOS</a>
            <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false" style="color: #000;font-size: 13px;">REPORTES</a>
        </nav>
        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
        <br>
        <div class="container">
            <!--Menu-->
            <div class="row">
                    <div class="col-md-3">
                        <form action="" method="post">
                            <select name="dnipro" style="font-size: 12px;width: 70%">
                                <option>Lista de docentes</option>
<%
    Connection cnx=null;
    Statement sta=null;
    ResultSet rs=null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select dni_pro,apellidos_pro,nombre_pro from profesores order by apellidos_pro");
    while (rs.next()){
%>
                                <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%>, <%=rs.getString(3)%></option>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>  
                            </select>
                            <button style="background: transparent;border: 0px;"><img src="media/busqueda.png"></button>
                        </form>
                    </div>
                            
                    <div class="col-md-3">
                        <form>
                            <select style="font-size: 12px;width: 70%">
                                <option>Docentes con cursos</option>
<%
try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from cursos");
    while (rs.next()){
%>
                                <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
           }
%> 
                            </select>
                            <button style="background: transparent;border: 0px;"><img src="media/busqueda.png"></button>
                        </form>
                    </div>
                            
                    <div class="col-md-6">
                        <form>
                            <select style="font-size: 12px;width: 70%">
                                <option>Lista de cursos</option>
<%
try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from cursos");
    while (rs.next()){
%>
                                <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
           }
%> 
                            </select>
                            <button style="background: transparent;border: 0px;"><img src="media/busqueda.png"></button>
                        </form>
                    </div>
            </div>
            <!--Contenido-->
            <div class="row">
                <div class="col-md-12">
                    <div class="col-md-12" style="margin-top: 3%;">
                        <div class="table-responsive" style="max-height: 300px;font-size: 12px;">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th></th>                                        
                                    <th style="text-align: center">Docente</th>
                                    <th style="text-align: center">Sede</th>
                                    <th style="text-align: center">Profesión</th>
                                    <th style="text-align: center">Grado</th>
                                    <th style="text-align: center">Opción</th>
                                </tr>
                            </thead>
<%
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from profesores order by apellidos_pro");
    while (rs.next()){
%>
                            <tbody>
                                <tr>
                                    <td style="text-align: center;padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;"><a><img src="media/usuario.png"></a></td>
                                    <td style="padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;"><a style="text-decoration: none;color: #000;" href="inicio.jsp?dnipro=<%=rs.getString(1)%>#popup2" onclick = "document.getElementById('light2').style.display='block';"><%=rs.getString(3)%>, <%=rs.getString(2)%></a></td>
                                    <td style="padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;"><%=rs.getString(15)%></td>
                                    <td style="padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;"><%=rs.getString(9)%></td>
                                    <td style="padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;"><%=rs.getString(8)%></td>
                                    <td style="padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;text-align: center;">
                                        <a style="text-decoration: none;color: #000;" href="editpro.jsp?dnipro=<%=rs.getString(1)%>">
                                            <img src="media/editar.png" alt="Editar"></a>
                                        <a style="text-decoration: none;color: #000;" href="eliminarpro.jsp?dnipro=<%=rs.getString(1)%>" onclick="return eliminar()">
                                            <img src="media/eliminar.png" alt="Eliminar"></a>
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
            </div>
            
            
            
            <!--Footer-->
            <div class="row">
                <div class="col">
                
                </div>
            </div>
        </div>
    </div>
    
    
    
  <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">...</div>
  <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">...</div>
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
                            
                            
                            
                            
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
