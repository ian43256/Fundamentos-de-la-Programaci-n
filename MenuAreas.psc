Proceso MenuAreas
    Definir opcion Como Entero;
    Definir lado, base, altura, baseT, alturaT, radio, resultado Como Real;
	
        Escribir "C�lculo de �reas";
        Escribir "";
        Escribir "1. Cuadrado";
        Escribir "2. Rect�ngulo";
        Escribir "3. Tri�ngulo";
        Escribir "4. C�rculo";
        Escribir "5. Salir";
        Escribir "";
        Escribir "Elige una opci�n: ";
        Leer opcion;
		
        Segun opcion Hacer
            1:
                Escribir "Ingresa el lado del cuadrado: ";
                Leer lado;
                resultado <- lado * lado;
                Escribir "El �rea del cuadrado es: ", resultado;
            2:
                Escribir "Ingresa la base del rect�ngulo: ";
                Leer base;
                Escribir "Ingresa la altura del rect�ngulo: ";
                Leer altura;
                resultado <- base * altura;
                Escribir "El �rea del rect�ngulo es: ", resultado;
            3:
                Escribir "Ingresa la base del tri�ngulo: ";
                Leer baseT;
                Escribir "Ingresa la altura del tri�ngulo: ";
                Leer alturaT;
                resultado <- (baseT * alturaT) / 2;
                Escribir "El �rea del tri�ngulo es: ", resultado;
            4:
                Escribir "Ingresa el radio del c�rculo: ";
                Leer radio;
                resultado <- PI * radio * radio;
                Escribir "El �rea del c�rculo es: ", resultado;
            5:
                Escribir "Gracias por usar mi calculadora de �reas";
            De Otro Modo:
                Escribir "Opci�n no v�lida.";
        FinSegun;
	
FinProceso