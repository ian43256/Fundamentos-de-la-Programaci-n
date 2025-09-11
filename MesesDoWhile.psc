Algoritmo MesesDoWhile
    Definir mes, dias Como Entero
    Definir nombreMes Como Cadena
	
    Repetir
        Escribir "Ingrese un número de mes (1-12): "
        Leer mes
		
        Si mes < 1 O mes > 12 Entonces
            Escribir "Número inválido. Intente de nuevo."
        FinSi
    Hasta Que mes >= 1 Y mes <= 12
	
    Segun mes Hacer
        1: nombreMes = "Enero"        ; dias = 31
        2: nombreMes = "Febrero"      ; dias = 28
        3: nombreMes = "Marzo"        ; dias = 31
        4: nombreMes = "Abril"        ; dias = 30
        5: nombreMes = "Mayo"         ; dias = 31
        6: nombreMes = "Junio"        ; dias = 30
        7: nombreMes = "Julio"        ; dias = 31
        8: nombreMes = "Agosto"       ; dias = 31
        9: nombreMes = "Septiembre"   ; dias = 30
        10: nombreMes = "Octubre"     ; dias = 31
        11: nombreMes = "Noviembre"   ; dias = 30
        12: nombreMes = "Diciembre"   ; dias = 31
    FinSegun
	
    Escribir "El mes es ", nombreMes, " y tiene ", dias, " días."
FinAlgoritmo
