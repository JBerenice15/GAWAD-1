<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Geolitic</h1>
        <p>Un pagina donde podras resolver dudas acerca de geometria analitica</p>
        <form method="POST" action="LoginAction">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre"/>
            <br>
            <label for="contra">Contraseña:</label>
            <input type="password" name="pass"/>
            <br>
            <input type="submit" value="Ingresar"/>
        </form>
    </body>
</html>
