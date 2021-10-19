window.addEventListener("load", () => {

    document.querySelector("#formularioRegistro").addEventListener("submit", () => {
        fetch(
            "https://api.giphy.com/v1/gifs/trending?api_key=X0a6dPUZXtHRXB7wXBGpiIJyZzRfYx0r&limit=25&rating=g"
        )
            .then((respuesta) => {
                return respuesta.json();
            })
            .then((informacion) => {
                for (let i = 0; i < informacion.data.length; i++) {
                    let datos = `<p> ${informacion.data[i].title}</p>`;
                    gif += `<img src="${informacion.data[i].images.original.url}">`;

                    document.querySelector(
                        "ul"
                    ).innerHTML += `<i> ${datos}</i>`;
                }
                console.log(informacion.data);
            })
            .catch((e) => {
                alert("error fallo en el api");
            });
    })
    
});
