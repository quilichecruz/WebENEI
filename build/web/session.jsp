<%-- 
    Document   : session
    Created on : 19/12/2017, 11:32:45 AM
    Author     : prac-enei5
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%   
    String id=request.getParameter("id");
    String dnipro=request.getParameter("dnipro");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session</title>
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
                        <div class="col-md-5">
                            <form action="clases_admin" method="post" class="form-horizontal">
                            <fieldset>
                                <legend></legend>
                                    <div class="form-group" style="display: none">
                                        <label class="col-md-4 control-label" for="textinput">id</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="id" type="text" class="form-control input-md" style="font-size: 12px;" required value="<%=id%>">
                                        </div>
                                    </div>
                                    <div class="form-group" style="display: none">
                                        <label class="col-md-4 control-label" for="textinput">dni</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="dnipro" type="text" class="form-control input-md" style="font-size: 12px;" required value="<%=dnipro%>">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">FECHA</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="fechas" type="text" class="form-control input-md campomyfecha" style="font-size: 12px;" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">HORA INICIO</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="horasini" type="time" class="form-control input-md" style="font-size: 12px;" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="textinput">HORA FIN</label>  
                                        <div class="col-md-4">
                                            <input id="textinput" name="horasfin" type="time" class="form-control input-md" style="font-size: 12px;" required>
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
                        
                        <div class="col-md-7">
                            <%
        Connection cnx=null;
        Statement sta=null;
        ResultSet rs=null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("select C.nombre_cur,R.fechatini,R.fechatfin,frec from registro R inner join cursos C on R.cod_cur=C.cod_cur where R.dni_pro="+dnipro+" and R.id_registro="+id);
        while (rs.next()){
    %>    
       
        <div class="card bg-white mb-3" style="max-width: 20rem;">
            <!--<div class="card-header">Detalle</div>!-->
                <div class="card-body">
                <h4 class="card-title"><%=rs.getString(1)%></h4>
                <p class="card-text">
                    <b>Fecha Inicio:</b> <%=rs.getString(2)%><br>
                    <b>Fecha Término:</b> <%=rs.getString(3)%><br>
                    <b>Frecuencia:</b> <%=rs.getString(4)%>
                </p>
            </div>
        </div>
    <% 
        }
        sta.close();
        rs.close();
        cnx.close();
        } catch (Exception e) {
        }
    %>                        
                            
                            <div class="table-responsive">
                                <table class="table table-hover table-bordered">
                                    <thead>
                                        <tr>
                                            <th style="text-align: center;color: white" class="bg-secondary">FECHA</th>
                                            <th style="text-align: center;color: white" class="bg-secondary">HORA</th>
                                            <th style="text-align: center;color: white" class="bg-secondary">OPCIÓN</th>
                                        </tr>
                                    </thead>                                   
                                    <tbody>
    <%
        try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("select id_sesion, fecha,horasini,horasfin from sesion where id_registro="+id);
        while (rs.next()){
    %>
                                    <tr>    
                                        <td style="text-align: center"><%=rs.getString(2)%></td>
                                        <td style="text-align: center"><%=rs.getString(3)%> - <%=rs.getString(4)%></td>
                                        <td style="text-align: center">
                                            <a href="#"><i class="material-icons" style="font-size: 15px; color: #000">edit</i></a>
                                            <a href="#"><i class="material-icons" style="font-size: 15px; color: #000">highlight_off</i></a>
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

                    </div>
                </div>
            
                <div class="col-md-12">
                    <a href="inicio.jsp?dnipro=<%=dnipro%>" style="color: #000;text-decoration: none;"><i class="material-icons" style="margin-left: 90%;font-size: 30px;">reply_all</i></a>
                </div>
            </div>                           
        </div>
    </body>
</html>
