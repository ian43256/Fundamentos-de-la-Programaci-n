Proceso EntradasCine
    Definir personas, parejas, individuales Como Entero
    Definir dia, membresiaStr, continuar Como Cadena
    Definir precioTotal Como Real
	
    Repetir
        Repetir
            Escribir "Ingresa el número de personas: "
            Leer personas
            Si personas <= 0 Entonces
                Escribir "Número inválido. Intente de nuevo."
            FinSi
        Hasta Que personas > 0
		
        Repetir
            Escribir "Ingresa el día de la semana: "
            Leer dia
            dia <- Minusculas(dia)
            Si dia <> "lunes" Y dia <> "martes" Y dia <> "miercoles" Y dia <> "miércoles" Y dia <> "jueves" Y dia <> "viernes" Y dia <> "sabado" Y dia <> "sábado" Y dia <> "domingo" Entonces
                Escribir "Día inválido. Intente de nuevo."
            FinSi
        Hasta Que dia = "lunes" O dia = "martes" O dia = "miercoles" O dia = "miércoles" O dia = "jueves" O dia = "viernes" O dia = "sabado" O dia = "sábado" O dia = "domingo"
		
        Repetir
            Escribir "¿Tienes membresía? (si/no): "
            Leer membresiaStr
            membresiaStr <- Minusculas(membresiaStr)
            Si membresiaStr <> "si" Y membresiaStr <> "no" Entonces
                Escribir "Respuesta inválida. Intente de nuevo."
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
		
        Escribir "¿Deseas calcular otra compra? (si/no): "
        Leer continuar
        continuar <- Minusculas(continuar)
    Hasta Que continuar = "no"

FinProceso

