Proceso PresupuestoPastel
    Definir sabor, tipoChocolate, respuestaSnack, snack, respuestaNombre, nombre Como Cadena;
    Definir precio Como Real;
	
    precio <- 0;
	
    Escribir "�Qu� sabor quiere el pastel? (manzana, fresa, chocolate): ";
    Leer sabor;
	
    Segun sabor Hacer
        "manzana":
            precio <- 200;
        "fresa":
            precio <- 250;
        "chocolate":
            Escribir "�Qu� tipo de chocolate? (negro o blanco): ";
            Leer tipoChocolate;
            Segun tipoChocolate Hacer
                "negro":
                    precio <- 280;
                "blanco":
                    precio <- 300;
                De Otro Modo:
                    Escribir "Tipo de chocolate no v�lido";
                    precio <- 0;
            FinSegun;
        De Otro Modo:
            Escribir "Sabor no v�lido";
            precio <- 0;
    FinSegun;
	
    Escribir "�Desea a�adir un snack de 25 pesos? (si/no): ";
    Leer respuestaSnack;
	
    Segun respuestaSnack Hacer
        "si":
            Escribir "Ingrese el nombre del snack: ";
            Leer snack;
            precio <- precio + 25;
        "no":
           
        De Otro Modo:
            Escribir "Respuesta no v�lida";
    FinSegun;
	
    Escribir "�Desea personalizar el pastel con un nombre por 30 pesos? (si/no): ";
    Leer respuestaNombre;
	
    Segun respuestaNombre Hacer
        "si":
            Escribir "Ingrese el nombre para el pastel: ";
            Leer nombre;
            precio <- precio + 30;
        "no":
            
        De Otro Modo:
            Escribir "Respuesta no v�lida para personalizaci�n";
    FinSegun;
	
    Escribir "El precio total de su pastel es: $", precio, " pesos.";
FinProceso
