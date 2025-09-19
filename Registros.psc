Proceso Registros
    Definir n, i, caracteres Como Entero
    Definir nombres, lista Como Cadena
    Definir edades Como Entero
    Definir promedios Como Real
	
    Dimension nombres[100]
    Dimension edades[100]
    Dimension promedios[100]
	
    Escribir "¿Cuántos estudiantes desea capturar?: "
    Leer n
	
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir ""
        Escribir "Estudiante ", i, ""
        Escribir "Nombre: "
        Leer nombres[i]
		
        Escribir "Edad: "
        Leer edades[i]
		
        Escribir "Promedio: "
        Leer promedios[i]
    FinPara
	
    Escribir ""
    Escribir "LISTADO DE ESTUDIANTES"
    Escribir "Nombre                Edad       Promedio"
    Escribir "--------------------------------------------"
	
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir nombres[i], "                   ", edades[i], "         ", promedios[i]
    FinPara
FinProceso

