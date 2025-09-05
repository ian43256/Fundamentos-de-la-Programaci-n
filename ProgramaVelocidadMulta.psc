Proceso ProgramaVelocidadMulta
    Definir velocidad Como Entero;
    Definir cumple Como Cadena;
	
    Escribir "Ingresa la velocidad: ";
    Leer velocidad;
	
    Escribir "¿Es tu cumpleaños? (si/no): ";
    Leer cumple;
	
    Si cumple = "si" O cumple = "SI" O cumple = "Si" Entonces
        Escribir "No tienes multa, Feliz cum.";
    Sino
        Si velocidad < 60 Entonces
            Escribir "No tienes multa.";
        Sino
            Si velocidad >= 60 Y velocidad <= 80 Entonces
                Escribir "Tienes una multa pequeña.";
            Sino
                Escribir "Tienes una multa grande.";
            FinSi;
        FinSi;
    FinSi;
FinProceso