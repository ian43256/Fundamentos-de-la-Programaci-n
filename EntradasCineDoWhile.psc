Proceso EntradasCine
    Definir personas, parejas, individuales Como Entero
    Definir dia, membresiaStr, continuar Como Cadena
    Definir precioTotal Como Real
	
    Repetir
        Repetir
            Escribir "Ingresa el n�mero de personas: "
            Leer personas
            Si personas <= 0 Entonces
                Escribir "N�mero inv�lido. Intente de nuevo."
            FinSi
        Hasta Que personas > 0
		
        Repetir
            Escribir "Ingresa el d�a de la semana: "
            Leer dia
            dia <- Minusculas(dia)
            Si dia <> "lunes" Y dia <> "martes" Y dia <> "miercoles" Y dia <> "mi�rcoles" Y dia <> "jueves" Y dia <> "viernes" Y dia <> "sabado" Y dia <> "s�bado" Y dia <> "domingo" Entonces
                Escribir "D�a inv�lido. Intente de nuevo."
            FinSi
        Hasta Que dia = "lunes" O dia = "martes" O dia = "miercoles" O dia = "mi�rcoles" O dia = "jueves" O dia = "viernes" O dia = "sabado" O dia = "s�bado" O dia = "domingo"
		
        Repetir
            Escribir "�Tienes membres�a? (si/no): "
            Leer membresiaStr
            membresiaStr <- Minusculas(membresiaStr)
            Si membresiaStr <> "si" Y membresiaStr <> "no" Entonces
                Escribir "Respuesta inv�lida. Intente de nuevo."
            FinSi
        Hasta Que membresiaStr = "si" O membresiaStr = "no"
		
        precioTotal <- 0
		
        Segun dia Hacer
            "miercoles":
                precioTotal <- personas * 30
            "jueves":
                parejas <- personas / 2
                individuales <- personas MOD 2
                precioTotal <- parejas * 75 + individuales * 50
            De Otro Modo:
                precioTotal <- personas * 50
        FinSegun
		
        Si membresiaStr = "si" Entonces
            precioTotal <- precioTotal * 0.9
        FinSi
		
        Escribir "El precio total de las entradas es: $", precioTotal
		
        Escribir "�Deseas calcular otra compra? (si/no): "
        Leer continuar
        continuar <- Minusculas(continuar)
    Hasta Que continuar = "no"

FinProceso

