Proceso RegistroCalificaciones
    Definir n, i, reprobadas Como Entero
    Definir listaReprobadas Como Cadena
    Definir calificaciones Como Real
    Dimension calificaciones[100]  
    
    Escribir "¿Cuántas calificaciones desea capturar?: "
    Leer n
    
    reprobadas <- 0
    listaReprobadas <- ""
    
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir "Ingrese la calificación ", i, ": "
        Leer calificaciones[i]
        
        Si calificaciones[i] < 7 Entonces
            reprobadas <- reprobadas + 1
            listaReprobadas <- Concatenar(listaReprobadas, ConvertirATexto(calificaciones[i]))
            listaReprobadas <- Concatenar(listaReprobadas, " ")
        FinSi
    FinPara
    
    Escribir ""
    Escribir "CALIFICACIONES CAPTURADAS"
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir calificaciones[i], " " Sin Saltar
    FinPara
    
    Escribir ""
    Si reprobadas > 0 Entonces
        Escribir "Hay ", reprobadas, " calificación(es) reprobatoria(s)."
        Escribir "Calificaciones reprobatorias: ", listaReprobadas
    SiNo
        Escribir "No hay calificaciones reprobatorias."
    FinSi
FinProceso

