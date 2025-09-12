Algoritmo PatronesCentrados
    Definir n, i, j, k, limite Como Entero
	
    Escribir "Ingrese el número de líneas (n): "
    Leer n
	
    Para i = 1 Hasta n
        Para j = 1 Hasta 5
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
    FinPara
	
    Escribir ""
	
    Para i = 1 Hasta n
        Para j = 1 Hasta n - i
            Escribir " " Sin Saltar   
        FinPara
        limite = 2 * i - 1
        Para k = 1 Hasta limite
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
    FinPara
	
    Escribir ""

    i = n
    Mientras i >= 1
        Para j = 1 Hasta n - i
            Escribir " " Sin Saltar
        FinPara
        limite = 2 * i - 1
        Para k = 1 Hasta limite
            Escribir "*" Sin Saltar
        FinPara
        Escribir ""
        i = i - 1
    FinMientras
	
FinAlgoritmo


