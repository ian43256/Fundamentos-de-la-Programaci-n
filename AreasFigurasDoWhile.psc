Algoritmo AreasFigurasDoWhile
    Definir opcion Como Entero
    Definir lado, baseR, alturaR, baseT, alturaT, radio, area Como Real
    Definir continuar Como Caracter
	
    Repetir
        Escribir ""
        Escribir "MENÚ DE ÁREAS"
        Escribir "1. Cuadrado"
        Escribir "2. Rectángulo"
        Escribir "3. Triángulo"
        Escribir "4. Círculo"
        Escribir "5. Salir"
        Escribir "Elija una opción: "
        Leer opcion
		
        Segun opcion Hacer
            1:
                Escribir "Ingrese el lado del cuadrado: "
                Leer lado
                area <- lado * lado
                Escribir "Área del cuadrado: ", area
            2:
                Escribir "Ingrese la base del rectángulo: "
                Leer baseR
                Escribir "Ingrese la altura del rectángulo: "
                Leer alturaR
                area <- baseR * alturaR
                Escribir "Área del rectángulo: ", area
            3:
                Escribir "Ingrese la base del triángulo: "
                Leer baseT
                Escribir "Ingrese la altura del triángulo: "
                Leer alturaT
                area <- (baseT * alturaT) / 2
                Escribir "Área del triángulo: ", area
            4:
                Escribir "Ingrese el radio del círculo: "
                Leer radio
                area <- 3.1416 * radio * radio
                Escribir "Área del círculo: ", area
            5:
                Escribir "Saliendo del programa..."
            De Otro Modo:
                Escribir "Opción inválida."
        FinSegun
		
        Si opcion <> 5 Entonces
            Escribir "¿Desea calcular otra área? (s/n): "
            Leer continuar
        SiNo
            continuar <- "n"
        FinSi
    Hasta Que continuar = "n" O continuar = "N"
	
    Escribir "Programa finalizado."
FinAlgoritmo
