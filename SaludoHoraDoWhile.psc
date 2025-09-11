Algoritmo SaludoHoraDoWhile
    Definir hora Como Entero
    Definir continuar Como Caracter
	
    Repetir
        Repetir
            Escribir "Ingrese la hora (0-23): "
            Leer hora
			
            Si hora < 0 O hora > 23 Entonces
                Escribir "Hora inválida. Intente de nuevo."
            FinSi
        Hasta Que hora >= 0 Y hora <= 23
		
        Si hora >= 6 Y hora <= 12 Entonces
            Escribir "¡Buenos días!"
        SiNo
            Si hora >= 13 Y hora <= 20 Entonces
                Escribir "¡Buenas tardes!"
            SiNo
                Escribir "¡Buenas noches!"
            FinSi
        FinSi
		
        Escribir "¿Desea ingresar otra hora? (s/n): "
        Leer continuar
    Hasta Que continuar = "n" O continuar = "N"
	
    Escribir "Programa finalizado."
FinAlgoritmo

