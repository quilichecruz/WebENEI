<%-- 
    Document   : login
    Created on : 01/12/2017, 10:16:33 AM
    Author     : prac-enei5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="assets/css/materialize/login.css">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
    </head>
    <body>
        <div class="container">                       
            <div class="row">
                <div class="col s12 m6 offset-m3">
                    <div class="card">
                        <div class="card-action center">
                            <img class="imglogin" alt="" src="media/logo.png">
                        </div>
                        <div class="card-content">
                            <form>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <i class="material-icons prefix black-text">account_circle</i>
                                        <input id="username" type="text" class="validate">
                                        <label for="username" class="active">Username</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <i class="material-icons prefix black-text">vpn_key</i>
                                        <input id="password" type="password" class="validate">
                                        <label for="password" class="active">Password</label>
                                    </div>
                                </div>
                                <div class="card-content center">
                                    <a class="btn waves-effect waves-light blue" onclick="Materialize.toast('Bienvenido', 1000)">Ingresar</a>
                                </div>
                            </form>
                        </div>
                        <div class="card-action center">
                            <label>Área de Sistemas e Informática - infoinei@inei.gob.pe</label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    </body>
</html>
