<%-- 
    Document   : assign
    Created on : 13/12/2017, 09:45:50 AM
    Author     : prac-enei5
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%   
    String dniadm=(String)session.getAttribute("dniadm");
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro= request.getParameter("dnipro");
    String nombrepro= request.getParameter("nombrepro");
    String apellidospro= request.getParameter("apellidospro");
    String codcur= request.getParameter("codcur");
    String nombrecur= request.getParameter("nombrecur");
    String id=request.getParameter("id");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assign</title>
        <link href="calendario_dw/calendario_dw-estilos.css" type="text/css" rel="STYLESHEET"> 
        <script type="text/javascript" src="calendario_dw/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="calendario_dw/calendario_dw.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type="text/javascript">
            $(document).ready(function(){
               $(".campomyfecha").calendarioDW();
            });
            $(document).ready(function(){
               $(".campomyfecha2").calendarioDW();
            });
        </script>
    </head>
    <body style="font-size: 11px;">
        <nav class="nav nav-tabs" id="myTab">
            <a class="nav-item nav-link" id="nav-home-tab" data-toggle="tab" href="#nav-report" role="tab" aria-controls="nav-report" aria-selected="false" style="color: #000;font-size: 13px;"><img src="media/logo.png" alt="" style="width: 45px;height: auto;text-align: center;"></a>
        </nav>
        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
        <br>
                <div class="container">
                    <div class="row">
                        <div class="col-md-5">
                            <form class="form-horizontal">
                            <fieldset>
                                <legend></legend>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="selectbasic">Docente</label>
                                        <div class="col-md-8">
                                            <select id="selectbasic" name="selectbasic" class="form-control" style="font-size: 12px;" required>
                                                <option value="<%=dnipro%>"><%=apellidospro%> <%=nombrepro%></option>  
            <%
                    Connection cnx=null;
                    Statement sta=null;
                    ResultSet rs=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                    sta=cnx.createStatement();
                    rs=sta.executeQuery("select dni_pro,nombre_pro,apellidos_pro,prof_pro,grad_pro,sede_pro from profesores order by apellidos_pro");
                    while (rs.next()){
            %>
                                                <option value="<%=rs.getString(1)%>"><%=rs.getString(3)%> <%=rs.getString(2)%></option>    
            <% 
            }
            sta.close();
            rs.close();
            cnx.close();
                } catch (Exception e) {
                       }
            %>  
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="selectbasic">Curso</label>
                                        <div class="col-md-8">
                                            <select id="selectbasic" name="selectbasic" class="form-control" style="font-size: 12px;" required>
                                                <option value="<%=codcur%>"><%=nombrecur%></option>
            <%
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                    sta=cnx.createStatement();
                    rs=sta.executeQuery("select * from cursos order by nombre_cur");
                    while (rs.next()){
            %>
                                                <option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>
            <% 
            }
            sta.close();
            rs.close();
            cnx.close();
                } catch (Exception e) {
                       }
            %>  
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">Frecuencia</label>  
                                        <div class="col-md-8">
                                            <input id="textinput" name="textinput" type="text" class="form-control input-md" style="font-size: 12px;">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">Fecha de inicio</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="textinput" type="text" class="form-control input-md campomyfecha" style="font-size: 12px;" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">Fecha término</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="textinput" type="text" class="form-control input-md campomyfecha" style="font-size: 12px;" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="selectbasic">Estado</label>
                                        <div class="col-md-4">
                                            <select id="selectbasic" name="selectbasic" class="form-control" style="font-size: 12px;">
                                                <option value="Por Iniciar">Por Iniciar</option>
                                                <option value="En Ejecucion">En Ejecución</option>
                                                <option value="Finalizo">Finalizó</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="selectbasic">Laboratorio</label>
                                        <div class="col-md-4">
                                            <select id="selectbasic" name="selectbasic" class="form-control" style="font-size: 12px;">
                                                <option value="Sin Asignar">Sin Asignar</option>
                                                <option value="Lab 01">LAB 01</option>
                                                <option value="Lab 02">LAB 02</option>
                                                <option value="Lab 03">LAB 03</option>
                                                <option value="Lab 04">LAB 04</option>
                                                <option value="Lab 05">LAB 05</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">Inscritos</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="textinput" type="number" class="form-control input-md" value="0" style="font-size: 12px;">
                                      </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-2 control-label" for="textinput"></label>  
                                        <div class="col-md-4">
                                            <button id="singlebutton" name="singlebutton" class="btn btn-primary" style="padding: 10px 10px 10px 10px;font-size: 10px;">GRABAR</button>
                                        </div>
                                    </div>
                            </fieldset>
                        </form>
                        </div>
            <div class="col-md-4">
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("select nombre_pro, apellidos_pro, prof_pro, sede_pro from profesores "
                + "where c1 like '"+nombrecur+"' or "
                + "c2 like '"+nombrecur+"' or "
                + "c3 like '"+nombrecur+"' or "
                + "c4 like '"+nombrecur+"' or "
                + "c5 like '"+nombrecur+"' or "
                + "c6 like '"+nombrecur+"' or "
                + "c7 like '"+nombrecur+"' or "
                + "c8 like '"+nombrecur+"' or "
                + "c9 like '"+nombrecur+"' or "
                + "c10 like '"+nombrecur+"' or "
                + "c11 like '"+nombrecur+"' or "
                + "c12 like '"+nombrecur+"'");
        while (rs.next()){
%>
<ul class="list-group" >
  <li class="list-group-item d-flex justify-content-between align-items-center">
    <%=rs.getString(2)%> <%=rs.getString(1)%>
    <span class="badge badge-primary badge-pill"><%=rs.getString(3)%></span>
    <span class="badge badge-primary badge-pill"><%=rs.getString(4)%></span>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
</ul>

<% 
}
sta.close();
rs.close();
cnx.close();
    } catch (Exception e) {
           }
%>   
                            
                        </div>

<div class="col-md-3">
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("select if(c1 !='null',c1,''), if(c2 !='null',c2,''),"
                    + "if(c3 !='null',c3,''), if(c4 !='null',c4,''),"
                    + "if(c5 !='null',c5,''), if(c6 !='null',c6,''),"
                    + "if(c7 !='null',c7,''), if(c8 !='null',c8,''),"
                    + "if(c9 !='null',c9,''), if(c10 !='null',c10,''),"
                    + "if(c11 !='null',c11,''), if(c12 !='null',c12,'') from profesores"
                + " where dni_pro="+dnipro);
        while (rs.next()){
%>
<ul class="list-group">
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(1)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(2)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(3)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(4)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(5)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(6)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(7)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(8)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(10)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(11)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center"><%=rs.getString(12)%>
    <span class="badge badge-primary badge-pill list-group-item-danger">R</span>
  </li>
</ul>

<% 
}
sta.close();
rs.close();
cnx.close();
    } catch (Exception e) {
           }
%>   
                            
                        </div>


                    </div>
                </div>
            
                <div class="col-md-12">
                    <a href="inicio.jsp?dnipro=<%=dnipro%>" style="color: #000;text-decoration: none;"><i class="material-icons" style="margin-left: 90%;font-size: 30px;">arrow_back</i></a>
                </div>
            </div>                           
        </div>
    </body>
</html>
