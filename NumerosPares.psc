Proceso NumerosPares
    Definir a, b, c, ab, bc, ac, resultado Como Entero;
	
    Escribir "Ingresa el valor de a: ";
    Leer a;
	
    Escribir "Ingresa el valor de b: ";
    Leer b;
	
    Escribir "Ingresa el valor de c: ";
    Leer c;
	
    ab <- a + b;
    bc <- b + c;
    ac <- a + c;
	
    Si (ab = 10) O (bc = 10) O (ac = 10) Entonces
        resultado <- 10;
    Sino
        Si (ab = ac + 10) O (ab = bc + 10) Entonces
            resultado <- 5;
        Sino
            resultado <- 0;
        FinSi;
    FinSi;
	
    Escribir "El resultado es: ", resultado;
FinProceso
