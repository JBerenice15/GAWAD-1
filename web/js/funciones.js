function validar(){           
    var nombre = document.Logininicio.nombre;
    var pass = document.Logininicio.contra;    
    if(!nombre.value && !pass.value){
        swal("huy...hubo un error", "Los campos de nombre y contraseña estan vacios", "error");
        nombre.focus();
        pass.focus();   
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

function limpiar(){
   document.getElementById("RegistraLogin").reset();          
}


