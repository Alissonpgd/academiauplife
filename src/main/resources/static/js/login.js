function Sign() {
    

    var usuario = document.getElementById('name')
    var senha = document.getElementById('password')


    if (usuario.value !== "Glaubiano21") {
        alert("Usuario Invalido!");

    } else if (senha.value !== "UpLife_2021") {
        alert("Senha Invalida!")
    } else {
        alert("Seja Bem Vindo!")
        window.location.href = "index.html"
    }
}