Proceso ProgramaEdad
    Definir edad Como Entero;
	
    Escribir "Ingresa tu edad: ";
    Leer edad;
	
    Si edad < 18 Entonces
        Escribir "Eres menor de edad.";
    Sino
        Si edad >= 18 Y edad <= 65 Entonces
            Escribir "Eres mayor de edad.";
        Sino
            Escribir "Eres un adulto mayor.";
        FinSi;
    FinSi;
FinProceso