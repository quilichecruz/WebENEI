<%-- 
    Document   : edit_curso
    Created on : 27/12/2017, 12:45:14 PM
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
    String codcur = request.getParameter("codcur");

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
        rs=sta.executeQuery("select * from cursos where cod_cur='"+codcur+"'");
        while (rs.next()){

        %>

    <form class="form-horizontal">
        <fieldset>
            <legend style="font-weight: 600">EDITAR</legend>
            <div class="form-row">
                <div class="form-group col-md-12" style="text-align: right">
                    <button name="btneditar" class="btn btn-primary" type="submit">Grabar</button>
                </div>
            </div> 
            
            
            
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="codcur">CODIGO</label>
                    <input name="codcur" type="text" class="form-control" id="codcur" value="<%=rs.getInt(1)%>" readonly="">
                </div>
                <div class="form-group col-md-6">
                    <label for="nombrecur">CURSO</label>
                    <input name="nombrecur" type="text" class="form-control" id="nombrecur" value="<%=rs.getString(2)%>">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="vaca">VACANTES</label>
                    <input name="vaca" type="text" class="form-control" id="vaca" value="<%=rs.getInt(3)%>">
                </div>
                <div class="form-group col-md-6">
                    <label for="cost">COSTO S/.</label>
                    <input name="cost" type="text" class="form-control" id="cost" value="<%=rs.getFloat(4)%>">
                </div>
            </div>
        
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label for="desc">DESCRIPCIÓN</label>
                    <textarea name="desc" class="form-control" id="desc"><%=rs.getString(5)%></textarea>
                </div>
            </div>  
              
        
  </fieldset>
  </form>
   <% 
      }
    } catch (Exception e) {
           }

if(request.getParameter("btneditar")!=null){
int vaca = Integer.parseInt(request.getParameter("vaca"));
float cost = Float.parseFloat(request.getParameter("cost"));
String desc = request.getParameter("desc");

sta.executeUpdate("update cursos set cod_cur='"+codcur+"',nombre_cur='"+nombrecur+"',vaca_cur='"+vaca+"',cost='"+cost+"',desc_cur='"+desc+"' where cod_cur='"+codcur+"'");
        
response.sendRedirect("inicio.jsp");

sta.close();
rs.close();
cnx.close();


}
      
      %>             
                
                
                
                
                
                
            </div>
            </div>    
                            
      

        </div>
    </div>
    

</div>
     
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>

