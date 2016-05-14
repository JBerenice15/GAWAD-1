<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>:::Geolitic:::Registrate</title>
        <link type="text/css" rel="stylesheet" href="./css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="./css/estilos.css">
        <link type="text/css" rel="stylesheet" href="./css/sweetalert.css">
        <script src="./js/bootstrap.min.js"></script>
        <script src="./js/jquery-1.12.3.min.js"></script>
        <script src="./js/sweetalert.min.js"></script>        
        <script src="./js/funciones.js"></script>
    </head>
    <body>        
        <div class="container">            
            <br>
            <br>
            <br>
            <div class="row">
                <h1 class="col-md-6">Geolitic</h1> 
                <p class="col-md-6 lead" style="top: 25px;">Una página donde podrás resolver problemas de geometría analítica: Línea Recta, Circunferencia y Parábola.</p>                    
            </div>
            <br>
            <br>
            <br>
            <div class="container caja" style="width:800px; height: 750px;">
                <div class="row">
                    <p class="text-center col-md-12">Registrate es gratis!</p>
                </div>            
                <br>
                <div class="row">
                    <form action="RegistraAction" method="POST" class="form-horizontal" id="RegistraLogin" name="RegistraLogin" role="form" onsubmit="return registro();">
                        <div class="form-group row">
                            <label for="nombre" class="control-label col-md-4 lead">* Nombre:</label>
                            <div class="col-md-7">
                                <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingresa tu(s) nombre(s)">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="appat" class="control-label col-md-4 lead">* Apellido Paterno:</label>
                            <div class="col-md-7">
                                <input type="text" class="form-control" name="appat" id="appat" placeholder="Ingresa tu apellido paterno">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="apmat" class="control-label col-md-4 lead">* Apellido Materno:</label>
                            <div class="col-md-7">
                                <input type="text" class="form-control" name="apmat" id="apmat" placeholder="Ingresa tu apellido materno">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="sexo" class="control-label col-md-4 lead"style="top:10px;">* Sexo:</label>
                            <div class="col-md-5">
                                <label class="radio-inline lead" style="left:-20px;top:-10px;">M:<input type="radio" id="sexo" name="sexo" value="M" style="left:70px; top:10px;"></label>
                                <label class="radio-inline lead" style="left:-20px;top:-10px;">F:<input type="radio" id="sexo" name="sexo"value="F" style="left:60px; top:10px;"></label>
                            </div>                            
                        </div>
                        <div class="form-group row">
                            <label for="edad" class="control-label col-md-4 lead">* Edad:</label>
                            <div class="col-md-7">
                                <input type="text" class="form-control" name="edad" id="edad" placeholder="Ingresa tu edad">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="username" class="control-label col-md-4 lead">* Nombre de Usuario:</label>
                            <div class="col-md-7">
                                <input type="text" class="form-control" name="username" id="username" placeholder="Ingresa tu nombre de usuario">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="pass" class="control-label col-md-4 lead">* Contraseña:</label>
                            <div class="col-md-7">
                                <input type="password" class="form-control" name="pass" id="contra" placeholder="Ingresa tu contraseña">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="repcontra" class="control-label col-md-4 lead">* Repite contraseña:</label>
                            <div class="col-md-7">
                                <input type="password" class="form-control" name="repcontra" id="repcontra" placeholder="Confirma tu contraseña">
                            </div>
                        </div>
                        <div class="form-group-sm">                            
                            <p class="lead" style="margin-left:40px;">* Campos Obligatorios</p>   
                            <div class="col-md-offset-6">                                                   
                                <input type="submit" class="btn btn-primary" value="Enviar" id="btn_enviar" style="height: 45px; width: 150px; font-size: 23px;"/>
                                <input type="button" class="btn btn-primary" value="Cancelar" id="btn_enviar" onclick="limpiar();" style="height: 45px; width: 150px; font-size: 23px; margin-left:30px;"/>
                            </div>
                        </div>
                    </form>
                </div>                
            </div>
            <br>
            <footer>
                <p class="text-center">@GAWAD::2016 &COPY;Copyright Todos los derechos Reservados<br><a href="acercade.html" style="color: #FFF; text-decoration: underline;">Acerca de la aplicación web</a></p>                                
            </footer>
        </div>
    </body>
</html>
