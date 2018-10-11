var btnCancelar = document.getElementById("btnCancelar");
btnCancelar.addEventListener("click",function(){
    alert("Cancelado");
});

function validarForm(){
    var femail = document.forms["frmLogin"]["femail"].value;
    if (femail == "") {
        alert("Ingrese Correo");
        return false;
    }
}
