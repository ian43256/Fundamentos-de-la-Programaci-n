Proceso SaludoHora
    Definir hora Como Entero;
	
    Escribir "Introduce la hora (0-23): ";
    Leer hora;
	
    Si hora >= 6 Y hora <= 12 Entonces
        Escribir "Buenos días";
    Sino
        Si hora >= 13 Y hora <= 20 Entonces
            Escribir "Buenas tardes";
        Sino
            Si (hora >= 21 Y hora <= 23) O (hora >= 0 Y hora <= 5) Entonces
                Escribir "Buenas noches";
            Sino
                Escribir "Hora no válida. Debe estar entre 0 y 23.";
            FinSi;
        FinSi;
    FinSi;
FinProceso