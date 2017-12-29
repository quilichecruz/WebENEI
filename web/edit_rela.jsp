<%-- 
    Document   : edit_rela
    Created on : 28/12/2017, 09:26:59 AM
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
    String nombrecur= request.getParameter("nombrecur");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
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
            <!--Menu-->
            <div class="row"> 
            </div>
            <!--Contenido-->
            <div class="row">
                <div class="col-md-12">
<% 
        Connection cnx=null;
        Statement sta=null;
        ResultSet rs=null;
        
try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("select T1.id_registro,T1.cod_cur,T3.nombre_cur,T1.paga,T1.dni_pro,T2.nombre_pro,T2.apellidos_pro,T1.fechatini,T1.fechatfin,T1.esta,T1.labo,T1.frec,T3.nombre_cur FROM registro T1 INNER JOIN profesores T2 INNER JOIN cursos T3  ON T1.dni_pro = T2.dni_pro AND T1.cod_cur = T3.cod_cur where T1.id_registro="+id);
        while (rs.next()){

%>      

<form action="" class="form-horizontal">
        <fieldset>
            <legend style="font-weight: 600">EDITAR</legend>
            <div class="form-row">
                <div class="form-group col-md-6" style="display: none">
                    <label for="id">ID</label>
                    <input name="id" type="text" class="form-control" id="id" value="<%=id%>" readonly="" >
                </div>
                <div class="form-group col-md-6" style="display: none">
                    <label for="dnipro">DNI</label>
                    <input name="dnipro" type="text" class="form-control" id="dnipro" value="<%=rs.getString(5)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label for="frec">FRECUENCIA</label>
                    <input name="frec" type="text" class="form-control" id="frec" value="<%=rs.getString(12)%>">
                </div>
                <div class="form-group col-md-6">
                    <label for="fechatini">FECHA INICIO</label>
                    <input name="fechatini" type="text" class="form-control campomyfecha" id="fechatini" value="<%=rs.getString(8)%>">
                </div>
                <div class="form-group col-md-6">
                    <label for="fechatini">FECHA FIN</label>
                    <input name="fechatfin" type="text" class="form-control campomyfecha" id="fechatini" value="<%=rs.getString(9)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="esta">ESTADO</label>
                    <select name="esta" class="form-control" id="esta">
                        <option value="<%=rs.getString(10)%>"><%=rs.getString(10)%></option>
                        <option value="Por Iniciar">Por Iniciar</option>
                        <option value="En Ejecucion">En Ejecución</option>
                        <option value="Finalizo">Finalizó</option>
                    </select> 
                </div>
                <div class="form-group col-md-4">
                    <label for="labo">LABORATORIO</label>
                    <select name="labo" class="form-control" id="labo">
                        <option value="<%=rs.getString(11)%>"><%=rs.getString(11)%></option>
                        <option value="Lab 01">LAB 01</option>
                        <option value="Lab 02">LAB 02</option>
                        <option value="Lab 03">LAB 03</option>
                        <option value="Lab 04">LAB 04</option>
                        <option value="Lab 05">LAB 05</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="paga">INSCRITOS</label>
                    <input name="paga" type="number" class="form-control" id="paga" value="<%=rs.getInt(4)%>">
                </div>  
            </div> 
                 <div class="form-row">
                <div class="form-group col-md-12" style="text-align: right">
                    <button name="btneditar2" class="btn btn-primary" type="submit">Grabar</button>
                </div>
            </div> 

               <%--    
      
                    <a onclick="history.go(0)" href="" style="margin-right: 40px;"><img src="Iconos/actu.png" alt="" style="width: 30px; height: 30px;">Actualizar</a>
        <a href="home_admin.jsp?dnipro=<%=dnipro%>#popup2"><img  alt="" src="Iconos/inicio.png" style="width: 30px;height: 30px;"> Volver a Inicio</a>
        <h3>¡ ACTUALIZA PARA VER LOS CAMBIOS !</h3>--%>
        
  </fieldset>
                      <% 
      }
    } catch (Exception e) {
           }

if(request.getParameter("btneditar2")!=null){

String esta = request.getParameter("esta");          
String labo = request.getParameter("labo"); 
String paga = request.getParameter("paga");
String frec = request.getParameter("frec");
String fechatini = request.getParameter("fechatini");   
String fechatfin = request.getParameter("fechatfin");


sta.executeUpdate("update registro set paga='"+paga+"',frec='"+frec+"',fechatini='"+fechatini+"',fechatfin='"+fechatfin+"',esta='"+esta+"',labo='"+labo+"' where id_registro="+id);
response.sendRedirect("inicio.jsp?dnipro="+dnipro);

sta.close();
rs.close();
cnx.close();
}
      
      %>
                
  </form>

            </div>
            </div>    
                            
      

        </div>
    </div>
    

</div>

               
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
