Proceso MenuAreas
    Definir opcion Como Entero;
    Definir lado, base, altura, baseT, alturaT, radio, resultado Como Real;
	
        Escribir "Cálculo de Áreas";
        Escribir "";
        Escribir "1. Cuadrado";
        Escribir "2. Rectángulo";
        Escribir "3. Triángulo";
        Escribir "4. Círculo";
        Escribir "5. Salir";
        Escribir "";
        Escribir "Elige una opción: ";
        Leer opcion;
		
        Segun opcion Hacer
            1:
                Escribir "Ingresa el lado del cuadrado: ";
                Leer lado;
                resultado <- lado * lado;
                Escribir "El área del cuadrado es: ", resultado;
            2:
                Escribir "Ingresa la base del rectángulo: ";
                Leer base;
                Escribir "Ingresa la altura del rectángulo: ";
                Leer altura;
                resultado <- base * altura;
                Escribir "El área del rectángulo es: ", resultado;
            3:
                Escribir "Ingresa la base del triángulo: ";
                Leer baseT;
                Escribir "Ingresa la altura del triángulo: ";
                Leer alturaT;
                resultado <- (baseT * alturaT) / 2;
                Escribir "El área del triángulo es: ", resultado;
            4:
                Escribir "Ingresa el radio del círculo: ";
                Leer radio;
                resultado <- PI * radio * radio;
                Escribir "El área del círculo es: ", resultado;
            5:
                Escribir "Gracias por usar mi calculadora de áreas";
            De Otro Modo:
                Escribir "Opción no válida.";
        FinSegun;
	
FinProceso