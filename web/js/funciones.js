function validar(){           
    var nombre = document.Logininicio.nombre;
    var pass = document.Logininicio.contra;    
    if(!nombre.value && !pass.value){
        swal("huy...hubo un error", "Los campos de nombre y contraseña estan vacios", "error");
        nombre.focus();       
        return false;
    }else if(!nombre.value){
        swal("huy...hubo un error", "El campo de nombre no puede estar vacio", "error");
        nombre.focus();                
        return false;
    }else if(!pass.value){
        swal("huy...hubo un error", "El campo contraseña no puede estar vacio", "error");
        pass.focus();            
        return false;
    }
    return true;
}

function registro(){
    var nombre = document.getElementById("nombre").value;
    var appat = document.getElementById("appat").value;
    var apmat = document.getElementById("apmat").value;
    var sexo = document.getElementById("sexo").checked;
    var edad = document.getElementById("edad").value;
    var username = document.getElementById("username").value;
    var pass = document.getElementById("pass").value;
    var reppass = document.getElementById("repcontra").value;
    if(!nombre && !appat && !apmat && !sexo && !edad && !username && !pass && !reppass){
        swal("huy...hubo un error", "Debes de llenar los campos", "error");
        nombre.focus();
        return false;
    }else{
        if(nombre.length === 0 || /^\s+$/.test(nombre)){
            swal("huy...hubo un error", "El campo de Nombre no puede estar vacio", "error");
            nombre.focus();                
            return false;
        }else if(appat.length === 0 || /^\s+$/.test(appat)){
            swal("huy...hubo un error", "El campo de Apellido Paterno no puede estar vacio", "error");
            appat.focus();                
            return false;
        }else if(apmat.length === 0 || /^\s+$/.test(apmat)){
            swal("huy...hubo un error", "El campo de Apellido Materno no puede estar vacio", "error");
            apmat.focus();                
            return false;
        }else if(pass !== reppass){
            swal("huy...hubo un error", "Las contraseñas no coinciden", "error");
            nombre.focus();                
            return false;
        }
    }
    return true;
}

function limpiar(){
   document.getElementById("RegistraLogin").reset();          
}


