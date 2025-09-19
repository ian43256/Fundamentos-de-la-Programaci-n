Proceso EstadisticasCalificaciones
    Definir n, i Como Entero
    Definir suma, max, min, promedio Como Real
    
    Escribir "¿Cuántas calificaciones desea capturar?: "
    Leer n
    
    Dimension calificaciones[100]  
    
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir "Ingrese la calificación ", i, ": "
        Leer calificaciones[i]
    FinPara
    
    suma <- 0
    max <- calificaciones[1]
    min <- calificaciones[1]
    
    Para i <- 1 Hasta n Con Paso 1 Hacer
        suma <- suma + calificaciones[i]
        
        Si calificaciones[i] > max Entonces
            max <- calificaciones[i]
        FinSi
        
        Si calificaciones[i] < min Entonces
            min <- calificaciones[i]
        FinSi
    FinPara
    
    promedio <- suma / n
    
    Escribir ""
    Escribir "=== CALIFICACIONES CAPTURADAS ==="
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir calificaciones[i], " " Sin Saltar
    FinPara
    
    Escribir ""
    Escribir "Promedio: ", promedio
    Escribir "Calificación máxima: ", max
    Escribir "Calificación mínima: ", min
FinProceso
