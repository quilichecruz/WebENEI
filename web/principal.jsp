<%-- 
    Document   : principal
    Created on : 05/12/2017, 11:05:30 AM
    Author     : prac-enei5
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String user_admin= request.getParameter("user_admin");
    String nombre_pro= request.getParameter("nombre_admin");
    String id=request.getParameter("id");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript"  src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
        <script type="text/javascript"  src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
        
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
    
    
    </head>
    <body>
        <nav class="nav-extended blue darken-4">
            <div class="nav-wrapper">
                <a href="#" class="brand-logo" style="padding-left: 10px;">ENEI</a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="#"><i class="material-icons" style="display: inline">desktop_mac </i><%=hostname%></a></li>
                    <li><a href="#"><i class="material-icons" style="display: inline">adjust </i><%=ip%></a></li>
                </ul>
                <ul class="side-nav" id="mobile-demo">
                    <li><a href="#"><i class="material-icons" style="display: inline">desktop_mac </i><%=hostname%></a></li>
                    <li><a href="#"><i class="material-icons" style="display: inline">adjust </i><%=ip%></a></li>
                </ul>
            </div>
            <div class="nav-content">
                <ul class="tabs tabs-transparent">
                    <li class="tab"><a class="active" href="#test1">Docentes</a></li>
                    <li class="tab"><a href="#test2">Cursos</a></li>
                    <li class="tab"><a href="#test3">Reportes</a></li>
                </ul>
            </div>
        </nav>
        
        <div id="test1" style="font-size: 12px;font-weight: normal;color: #000;">
            <div class="row">
                <div class="col l6">
                    <table id="example" class="display" cellspacing="0" width="100%" style="height: 10%;">
        <thead>
            <tr>
                <th>DNI</th>
                <th>DOCENTE</th>
                <th>SEDE</th>
                <th>PROFESIÓN</th>
                <th>GRADO</th>
                <th>ACCIÓN</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>DNI</th>
                <th>DOCENTE</th>
                <th>SEDE</th>
                <th>PROFESIÓN</th>
                <th>GRADO</th>
                <th>ACCIÓN</th>
            </tr>
        </tfoot>
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
                                    <th class="danger mytr mycolor" title="Crear una relación"><a href="relacion.jsp?dnipro=<%=rs.getString(1)%>&nombrepro=<%=rs.getString(2)%>&apellidospro=<%=rs.getString(3)%>"><%=rs.getString(1)%></a></th>
                                    <th class="info mycolor" title="Ver detalle"><a href="home_admin.jsp?dnipro=<%=rs.getString(1)%>#popup2" onclick = "document.getElementById('light2').style.display='block';"><%=rs.getString(3)%>, <%=rs.getString(2)%></a></th>
                                   
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
        </tbody>
    </table>
        </div>
            </div></div>
        <div id="test2" class="col s12">Test 2</div>
        <div id="test3" class="col s12">Test 3</div>
        
        
        <script type="text/javascript">
            $(document).ready(function() {
                $('#example').DataTable();
            } );
        </script>
        <!--Import jQuery before materialize.js-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    </body>
</html>
