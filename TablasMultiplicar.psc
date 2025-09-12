Algoritmo TablasMultiplicar
	Definir n, i Como Entero
	
	Repetir
		Escribir "Ingrese un número para generar su tabla: "
		Leer n
		
		Si n <> 0 Entonces
			Escribir "Tabla de multiplicar del ", n, ":"
			Para i <- 1 Hasta 10 Con Paso 1 Hacer
				Escribir n, " x ", i, " = ", n * i
			Fin Para
		FinSi
	Hasta Que n = 0
	
	Escribir "Programa finalizado."
FinAlgoritmo