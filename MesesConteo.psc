Proceso MesesConteo
    Definir mes, dias Como Entero;
    Definir nombreMes Como Cadena;
	
    Escribir "Introduce un número entre el 1 y 12: ";
    Leer mes;
	
    Si mes < 1 O mes > 12 Entonces
        Escribir "Ese no es el número de un mes.";
    Sino
        Segun mes Hacer
            1:
                nombreMes <- "Enero";
                dias <- 31;
            2:
                nombreMes <- "Febrero";
                dias <- 28;
            3:
                nombreMes <- "Marzo";
                dias <- 31;
            4:
                nombreMes <- "Abril";
                dias <- 30;
            5:
                nombreMes <- "Mayo";
                dias <- 31;
            6:
                nombreMes <- "Junio";
                dias <- 30;
            7:
                nombreMes <- "Julio";
                dias <- 31;
            8:
                nombreMes <- "Agosto";
                dias <- 31;
            9:
                nombreMes <- "Septiembre";
                dias <- 30;
            10:
                nombreMes <- "Octubre";
                dias <- 31;
            11:
                nombreMes <- "Noviembre";
                dias <- 30;
            12:
                nombreMes <- "Diciembre";
                dias <- 31;
        FinSegun;
		
        Escribir "El mes ", nombreMes, " tiene ", dias, " días.";
    FinSi;
FinProceso