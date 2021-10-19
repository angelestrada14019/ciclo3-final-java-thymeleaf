let votos = [0, 0, 0, 0];

function votar(op) {
    switch (op) {
        case 0: {
            let total = votos[0] + votos[1] + votos[2] + votos[3];
            can1 = Math.round((votos[0] / total) * 100);
            can2 = Math.round((votos[1] / total) * 100);
            can3 = Math.round((votos[2] / total) * 100);
            can4 = Math.round((votos[3] / total) * 100);
            alert(
                `El candidato Alejandro Gaviria obtuvo ${votos[0]} (${can1}%) de ${total} votos totales \nEl candidato Gustavo Petro obtuvo ${votos[1]} (${can2}%) de ${total} votos totales \nEl candidato Juan Manuel Galan obtuvo ${votos[2]} (${can3}%) de ${total} votos totales \nEl candidato Sergio Fajardo obtuvo ${votos[3]} (${can4}%) de ${total} votos totales`
            );
            break;
        }
        case 1: {
            votos[0] = votos[0] + 1;
            alert(`${votos[0]} Votos para  Juan Manuel Galan`);
            break;
        }
        case 2: {
            votos[1] = votos[1] + 1;
            alert(`${votos[1]} Votos para  Alejandro Gaviria`);
            break;
        }
        case 3: {
            votos[2] = votos[2] + 1;
            alert(`${votos[2]} Votos para Sergio Fajardo`);
            break;
        }
        case 4:
            {
                votos[3] = votos[3] + 1;
                alert(`${votos[3]} Votos para  Gustavo Petro`);
                break;
            }
            
    }
}
