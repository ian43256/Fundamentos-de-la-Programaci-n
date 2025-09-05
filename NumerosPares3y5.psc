Proceso NumerosPares3y5
    Definir num Como Entero;
	
    Escribir "PROGRAMA MULTIPLO DE 3 o 5";
    Escribir "Ingresa un numero: ";
    Leer num;
	
    Si (num % 3 = 0) Y (num % 5 = 0) Entonces
        Escribir "Falso";
    Sino
        Si (num % 3 = 0) O (num % 5 = 0) Entonces
            Escribir "Verdadero";
        Sino
            Escribir "El numero no es multiplo de 5 ni de 3";
        FinSi;
    FinSi;
FinProceso