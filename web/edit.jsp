<%-- 
    Document   : edit
    Created on : 27/12/2017, 10:01:06 AM
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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Dosis" rel="stylesheet">
        <script type="text/javascript"> 
        $(function () {
        $('[data-toggle="tooltip"]').tooltip();
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

    <form class="form-horizontal">
        <fieldset>
            <legend style="font-weight: 600">EDITAR</legend>
            <div class="form-row">
                <div class="form-group col-md-10" style="text-align: right">
                    <button name="btneditar" class="btn btn-primary" type="submit">Grabar</button>
                </div>
                <div class="form-group col-md-1" style="text-align: right">
                    <button class="btn btn-danger" type="submit" onclick="history.go(0)">Actualizar</button>
                </div>
                <div class="form-group col-md-1" style="text-align: right">
                    <a href="inicio.jsp?dnipro=<%=dnipro%>#popup2" style="color: #000;text-decoration: none;"><i class="material-icons" style=";font-size: 30px;" title="Volver al inicio">reply_all</i></a>

                </div>
            </div> 
            
            
            
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="dni">DNI</label>
                    <input name="dnipro" type="text" class="form-control" id="dni" value="<%=rs.getString(1)%>" readonly="">
                </div>
                <div class="form-group col-md-6">
                    <label for="sede">SEDE</label>
                    <input name="sede" type="text" class="form-control" id="sede" value="<%=rs.getString(15)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="nombrepro">NOMBRES</label>
                    <input name="nombrepro" type="text" class="form-control" id="nombrepro" value="<%=rs.getString(2)%>">
                </div>
                <div class="form-group col-md-6">
                    <label for="apellidospro">APELLIDOS</label>
                    <input name="apellidospro" type="text" class="form-control" id="apellidospro" value="<%=rs.getString(3)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="tele">TELÉFONO</label>
                    <input name="tele" type="text" class="form-control" id="tele" value="<%=rs.getString(4)%>">
                </div>
                <div class="form-group col-md-6">
                    <label for="corr">CORREO</label>
                    <input name="corr" type="text" class="form-control" id="corr" value="<%=rs.getString(6)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label for="dire">DIRECCIÓN</label>
                    <input name="dire" type="text" class="form-control" id="dire" value="<%=rs.getString(5)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="prof">PROFESIÓN</label>
                    <input name="prof" type="text" class="form-control" id="prof" value="<%=rs.getString(9)%>">
                </div>
                <div class="form-group col-md-6">
                    <label for="grad">GRADO</label>
                    <input name="grad" type="text" class="form-control" id="grad" value="<%=rs.getString(8)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label for="espe">ESPECIALIDAD</label>
                    <textarea name="espe" class="form-control" id="espe"><%=rs.getString(12)%></textarea>
                </div>
                <div class="form-group col-md-12">
                    <label for="expe">EXPERIENCIA</label>
                    <textarea name="expe" class="form-control" id="expe"><%=rs.getString(14)%></textarea>
                </div>
            </div>  
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label>CURSOS DE REFERENCIA</label>
                </div>
                <div class="form-group col-md-4">
                    <label for="r1">CURSO 1</label>
                    <select name="c1" class="form-control" id="r1">
                    <option value="<%=rs.getString(16)%>"><%=rs.getString(16)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r2">CURSO 2</label>
                    <select name="c2" class="form-control" id="r2">
                    <option value="<%=rs.getString(17)%>"><%=rs.getString(17)%></option>
                    <%
                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r3">CURSO 3</label>
                    <select name="c3" class="form-control" id="r3">
                    <option value="<%=rs.getString(18)%>"><%=rs.getString(18)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r4">CURSO 4</label>
                    <select name="c4" class="form-control" id="r4">
                    <option value="<%=rs.getString(19)%>"><%=rs.getString(19)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r5">CURSO 5</label>
                    <select name="c5" class="form-control" id="r5">
                    <option value="<%=rs.getString(20)%>"><%=rs.getString(20)%></option>
                    <%
                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r6">CURSO 6</label>
                    <select name="c6" class="form-control" id="r6">
                    <option value="<%=rs.getString(21)%>"><%=rs.getString(21)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r7">CURSO 7</label>
                    <select name="c7" class="form-control" id="r7">
                    <option value="<%=rs.getString(22)%>"><%=rs.getString(22)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r8">CURSO 8</label>
                    <select name="c8" class="form-control" id="r8">
                    <option value="<%=rs.getString(23)%>"><%=rs.getString(23)%></option>
                    <%
                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r9">CURSO 9</label>
                    <select name="c9" class="form-control" id="r9">
                    <option value="<%=rs.getString(24)%>"><%=rs.getString(24)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r10">CURSO 10</label>
                    <select name="c10" class="form-control" id="r10">
                    <option value="<%=rs.getString(25)%>"><%=rs.getString(25)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r11">CURSO 11</label>
                    <select name="c11" class="form-control" id="r11">
                    <option value="<%=rs.getString(26)%>"><%=rs.getString(26)%></option>
                    <%
                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="r12">CURSO 12</label>
                    <select name="c12" class="form-control" id="r12">
                    <option value="<%=rs.getString(27)%>"><%=rs.getString(27)%></option>
                    <%
                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    %>
                    <option value="<%=rs1.getString(2)%>"><%=rs1.getString(2)%></option>
                    <% 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    %>  
                    </select>
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
    if(request.getParameter("btneditar")!=null){
    String apellidospro = request.getParameter("apellidospro");
    String tele = request.getParameter("tele");          
    String dire = request.getParameter("dire");   
    String corr = request.getParameter("corr");
    String cpre = request.getParameter("cpre");
    String grad = request.getParameter("grad");   
    String expe = request.getParameter("expe");
    String dipl = request.getParameter("dipl");
    String prof = request.getParameter("prof");
    String sede = request.getParameter("sede");
    String espe = request.getParameter("espe");
    String c1 = request.getParameter("c1"); 
    String c2 = request.getParameter("c2"); 
    String c3 = request.getParameter("c3"); 
    String c4 = request.getParameter("c4"); 
    String c5 = request.getParameter("c5"); 
    String c6 = request.getParameter("c6"); 
    String c7 = request.getParameter("c7"); 
    String c8 = request.getParameter("c8"); 
    String c9 = request.getParameter("c9"); 
    String c10 = request.getParameter("c10"); 
    String c11 = request.getParameter("c11"); 
    String c12 = request.getParameter("c12");

    sta.executeUpdate("update profesores set dni_pro='"+dnipro+"',nombre_pro='"+nombrepro+"',apellidos_pro='"+apellidospro+
    "',tele_pro='"+tele+"',dire_pro='"+dire+"',corr_pro='"+corr+"',cpre_pro='"+cpre+"',grad_pro='"+grad+"',expe_pro='"+expe+"',prof_pro='"+prof+"',sede_pro='"+sede+"',espe_pro='"+espe+"',"
    + "c1='"+c1+"',c2='"+c2+"',c3='"+c3+"',c4='"+c4+"',c5='"+c5+"',c6='"+c6+"'"
    + ",c7='"+c7+"',c8='"+c8+"',c9='"+c9+"',c10='"+c10+"',c11='"+c11+"',c12='"+c12+"' where dni_pro='"+dnipro+"'");

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


<script type="text/javascript">
    function showMe (it, box) {
    var vis = (box.checked) ? "block" : "none";
    document.getElementById(it).style.display = vis;
    }
</script>
               
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
