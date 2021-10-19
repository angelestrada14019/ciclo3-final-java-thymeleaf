const formulario = document.querySelector("#formularioRegistro");

const identificacion = document.querySelector("#identificacion");
const nombre = document.querySelector("#nombre");
const apellido = document.querySelector("#apellido");
const correo = document.querySelector("#correo");
const movil = document.querySelector("#movil");
const direccion = document.querySelector("#direccion");
const municipio_id = document.querySelector("#municipio_id");

const mensajeCorreo = document.querySelector("#mensajeCorreo");

const datosUsuario = [];

formulario.addEventListener("submit", (e) => {
    if (identificacion.value==null && nombre.value=="" && apellido.value=="" && correo.value=="" && movil.value==null && direccion.value=="" && municipio_id==null) {
        e.preventDefault();
        
    } else {
        console.log(
            normalizar(
                identificacion.value,
                nombre.value,
                apellido.value,
                correo.value,
                movil.value,
                direccion.value,
                municipio_id.value
            )
        );
        guardarDatos(
            normalizar(
                identificacion.value,
                nombre.value,
                apellido.value,
                correo.value,
                movil.value,
                direccion.value,
                municipio_id.value
            )
        );
    }
});

correo.addEventListener("blur", () => {    
    //validar nombre
    if (!validarEmail(correo.value)) {
        mensajeCorreo.classList.remove("oculto");
        correo.classList.add("error");
    } else {
        mensajeCorreo.classList.add("oculto");
        correo.classList.remove("error");
    }
});

function validarEmail(valor) {
    if (
        /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i.test(valor)
    ) {
        return true;
    } else {
        return false;
    }
}

function normalizar(ide, nom, ape, corr, mov,dire,muni_id) {
    const datos = {
        identificacion: ide,
        nombre: nom,
        apellido: ape,
        correo: corr,
        movil: mov,
        direccion: dire,
        municipio_id: muni_id,
    };

    return datos;
}

function guardarDatos(dato) {
    datosUsuario.push(dato);
    localStorage.setItem(
        "datoUsuario",
        JSON.stringify(datosUsuario)
    );
}
