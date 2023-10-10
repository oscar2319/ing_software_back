var boton = document.getElementById("miBoton");

boton.addEventListener("click", function() {
    // Cuando se hace clic en el botón, imprime un mensaje en la consola
    console.log("Click add cita");


    var nombre = $('#nombre').val();
    var email = $('#email').val();
    var veterinario = $('#veterinario').val();
    var fecha = $('#fecha').val();
    var comentarios = $('#comentarios').val();

    // Crear un objeto con los datos
    var citaData = {
        nombre: nombre,
        email: email,
        veterinario: veterinario,
        fecha: fecha,
        comentarios: comentarios
    };

    fetch("http://localhost:8080/agenda/crear", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(citaData)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Error al enviar la solicitud');
            }
            return response.json(); // Si el servidor devuelve una respuesta JSON
        })
        .then(data => {
            // Hacer algo con la respuesta del servidor si es necesario
            console.log(data);
        })
        .catch(error => {
            console.error('Error:', error);
        });
    console.log(citaData);

});