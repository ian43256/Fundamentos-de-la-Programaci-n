Proceso HoroscopoDoWhile
    Definir dia, mes Como Entero
    Definir signo, continuar Como Cadena
	
    Repetir
        Repetir
            Escribir "Introduce tu d�a de nacimiento (1-31): "
            Leer dia
            Si dia < 1 O dia > 31 Entonces
                Escribir "D�a inv�lido. Intente de nuevo."
            FinSi
        Hasta Que dia >= 1 Y dia <= 31
		
        Repetir
            Escribir "Introduce tu mes de nacimiento (1-12): "
            Leer mes
            Si mes < 1 O mes > 12 Entonces
                Escribir "Mes inv�lido. Intente de nuevo."
            FinSi
        Hasta Que mes >= 1 Y mes <= 12
		
        signo <- ""
		
        Segun mes Hacer
            1:
                Si dia <= 19 Entonces
                    signo <- "Capricornio"
                Sino
                    signo <- "Acuario"
                FinSi
            2:
                Si dia <= 18 Entonces
                    signo <- "Acuario"
                Sino
                    signo <- "Piscis"
                FinSi
            3:
                Si dia <= 20 Entonces
                    signo <- "Piscis"
                Sino
                    signo <- "Aries"
                FinSi
            4:
                Si dia <= 19 Entonces
                    signo <- "Aries"
                Sino
                    signo <- "Tauro"
                FinSi
            5:
                Si dia <= 20 Entonces
                    signo <- "Tauro"
                Sino
                    signo <- "G�minis"
                FinSi
            6:
                Si dia <= 20 Entonces
                    signo <- "G�minis"
                Sino
                    signo <- "C�ncer"
                FinSi
            7:
                Si dia <= 22 Entonces
                    signo <- "C�ncer"
                Sino
                    signo <- "Leo"
                FinSi
            8:
                Si dia <= 22 Entonces
                    signo <- "Leo"
                Sino
                    signo <- "Virgo"
                FinSi
            9:
                Si dia <= 22 Entonces
                    signo <- "Virgo"
                Sino
                    signo <- "Libra"
                FinSi
            10:
                Si dia <= 22 Entonces
                    signo <- "Libra"
                Sino
                    signo <- "Escorpio"
                FinSi
            11:
                Si dia <= 21 Entonces
                    signo <- "Escorpio"
                Sino
                    signo <- "Sagitario"
                FinSi
            12:
                Si dia <= 21 Entonces
                    signo <- "Sagitario"
                Sino
                    signo <- "Capricornio"
                FinSi
            De Otro Modo:
                signo <- "Mes inv�lido"
        FinSegun
		
        Escribir "Tu signo zodiacal es: ", signo
        Escribir "�Deseas calcular otro hor�scopo? (s/n): "
        Leer continuar
    Hasta Que continuar = "n" O continuar = "N"

FinProceso
