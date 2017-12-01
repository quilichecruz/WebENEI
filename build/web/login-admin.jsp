<%-- 
    Document   : login-admin
    Created on : 30/11/2017, 09:47:51 AM
    Author     : prac-enei5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="assets/css/custom/login.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    </head>
    <body class="login">
        <center>
            <img class="imglogin" alt="" src="media/logo.png">
            <form class="flogin">
                <label class="llogin">Username</label>
                <input class="ilogin" type="text" name="dniadmin" maxlength="10" required="">
                <label class="llogin">Password</label>
                <input class="ilogin" type="password" name="passadmin" maxlength="10" required="">
                <button class="blogin">Ingresar</button>
                <p class="plogin">Área de Sistemas e Informática - infoinei@inei.gob.pe</p>
            </form>
        </center>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
