<%-- 
    Document   : principal
    Created on : 04/12/2017, 10:53:12 AM
    Author     : prac-enei5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String user_admin= request.getParameter("user_admin");
    String nombre_pro= request.getParameter("nombre_admin");
    String id=request.getParameter("id");
%>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
                    <li class="tab"><a href="#test1">Docentes</a></li>
                    <li class="tab"><a class="active" href="#test2">Cursos</a></li>
                    <li class="tab"><a href="#test3">Reportes</a></li>
                </ul>
            </div>
        </nav>
        
        <div id="test1" class="col s12">Test 1</div>
        <div id="test2" class="col s12">Test 2</div>
        <div id="test3" class="col s12">Test 3</div>
        
        
        
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    </body>
</html>
