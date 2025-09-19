Proceso RegistroEstudiantes
    Definir n, i, caracteres Como Entero
    Definir estudiantes Como Cadena
    Dimension estudiantes[100]
	
    Escribir "¿Cuántos estudiantes desea capturar?: "
    Leer n
	
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir "Ingrese el nombre del estudiante ", i, ": "
        Leer estudiantes[i]
    FinPara
	
    Escribir ""
    Escribir "LISTA DE ESTUDIANTES"
	
    Para i <- 1 Hasta n Con Paso 1 Hacer
        caracteres <- Longitud(estudiantes[i])
		
        Si estudiantes[i] = Minusculas(estudiantes[i]) Entonces
            Escribir "- ", Mayusculas(estudiantes[i]), " (caracteres: ", caracteres, ")"
        Sino
            Si estudiantes[i] = Mayusculas(estudiantes[i]) Entonces
                Escribir "- ", Minusculas(estudiantes[i]), " (caracteres: ", caracteres, ")"
            SiNo
                Escribir "- ", estudiantes[i], " (caracteres: ", caracteres, ")"
            FinSi
        FinSi
    FinPara
FinProceso
SubProceso QuitarEspaciosExtremos(cad)
    Definir i, j, len Como Entero
    Definir res Como Cadena
	
    len <- Longitud(cad)
    i <- 0
    Mientras i < len Y Subcadena(cad, i, i) = " " Hacer
        i <- i + 1
    FinMientras
	
    j <- len - 1
    Mientras j >= i Y Subcadena(cad, j, j) = " " Hacer
        j <- j - 1
    FinMientras
	
    Si i > j Entonces
        res <- ""
    SiNo
        res <- Subcadena(cad, i, j)    
    FinSi
FinSubProceso
