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
        <link href="https://fonts.googleapis.com/css?family=Dosis" rel="stylesheet">
        
        <script type="text/javascript">
            $(document).ready(function(){
               $(".campomyfecha").calendarioDW();
            });
            $(document).ready(function(){
               $(".campomyfecha2").calendarioDW();
            });
        </script>
        
    </head>
    <body style="font-family: 'Dosis', sans-serif;">
        <nav class="nav nav-tabs" id="myTab">
            <a class="nav-item nav-link" id="nav-home-tab" data-toggle="tab" href="#nav-report" role="tab" aria-controls="nav-report" aria-selected="false" style="color: #000;font-size: 13px;"><img src="media/logocolor.png" alt="" style="width: 45px;height: auto;text-align: center;"></a>
        </nav>
        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
        <br>
                <div class="container">
                    <div class="row">
                        <div class="col-md-4">
                            <form action="relacion_admin" method="post" class="form-horizontal" >
                            <fieldset>
                                <legend style="font-weight: 600">ASIGNAR</legend>
                                <div class="form-row">
                                    <div class="form-group col-md-12">
                                        <label for="dnipro">DOCENTE</label>
                                        <select id="dnipro" name="dnipro" class="form-control" required="">
                                                <option value="<%=dnipro%>"><%=dnipro%> <%=apellidospro%> <%=nombrepro%></option>  
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
                                            
                                    <div class="form-group col-md-12">
                                        <label for="codcur">CURSO</label>
                                        <select id="codcur" name="codcur" class="form-control" required="">
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
                                            
                                            
                                <div class="form-row">
                                    <div class="form-group col-md-12">
                                        <label for="frec">FRECUENCIA</label>
                                        <input name="frec" type="text" class="form-control" id="frec">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12">
                                        <label for="fechatini">FECHA INICIO</label>
                                        <input name="fechatini" type="text" class="form-control campomyfecha" id="fechatini" required="">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12">
                                        <label for="fechatfin">FECHA TÉRMINO</label>
                                        <input name="fechatfin" type="text" class="form-control campomyfecha" id="fechatfin" required="">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12">
                                        <label for="esta">ESTADO</label>
                                            <select id="esta" name="esta" class="form-control">
                                                <option value="Por Iniciar">Por Iniciar</option>
                                                <option value="En Ejecucion">En Ejecución</option>
                                                <option value="Finalizo">Finalizó</option>
                                            </select>                                    
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="labo">LABORATORIO</label>
                                            <select id="labo" name="labo" class="form-control">
                                                <option value="Sin Asignar">Sin Asignar</option>
                                                <option value="Lab 01">LAB 01</option>
                                                <option value="Lab 02">LAB 02</option>
                                                <option value="Lab 03">LAB 03</option>
                                                <option value="Lab 04">LAB 04</option>
                                                <option value="Lab 05">LAB 05</option>
                                            </select>                                   
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12">
                                        <label for="paga">ALUMNOS INSCRITOS</label>
                                        <input name="paga" type="number" class="form-control" id="paga" value="0">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12" style="text-align: right">
                                        <button class="btn btn-primary" type="submit">Grabar</button>
                                    </div>
                                </div>  
                            </fieldset>
                        </form>
                        </div>
                                            
<div class="col-md-5">
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

<ul class="list-group" style=" max-height: 30px;">
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
                <a href="inicio.jsp?dnipro=<%=dnipro%>" style="color: #000;text-decoration: none;"><i title="Volver a inicio" class="material-icons" style="padding-bottom: 5%;margin-left: 100%;font-size: 30px;">reply_all
</i></a>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("select if(c1 !='null',c1,'ninguna'), if(c2 !='null',c2,'ninguna'),"
                    + "if(c3 !='null',c3,'ninguna'), if(c4 !='null',c4,'ninguna'),"
                    + "if(c5 !='null',c5,'ninguna'), if(c6 !='null',c6,'ninguna'),"
                    + "if(c7 !='null',c7,'ninguna'), if(c8 !='null',c8,'ninguna'),"
                    + "if(c9 !='null',c9,'ninguna'), if(c10 !='null',c10,'ninguna'),"
                    + "if(c11 !='null',c11,'ninguna'), if(c12 !='null',c12,'ninguna') from profesores"
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

            </div>                           
        </div>
    </body>
</html>
