Algoritmo AreasFigurasDoWhile
    Definir opcion Como Entero
    Definir lado, baseR, alturaR, baseT, alturaT, radio, area Como Real
    Definir continuar Como Caracter
	
    Repetir
        Escribir ""
        Escribir "MEN� DE �REAS"
        Escribir "1. Cuadrado"
        Escribir "2. Rect�ngulo"
        Escribir "3. Tri�ngulo"
        Escribir "4. C�rculo"
        Escribir "5. Salir"
        Escribir "Elija una opci�n: "
        Leer opcion
		
        Segun opcion Hacer
            1:
                Escribir "Ingrese el lado del cuadrado: "
                Leer lado
                area <- lado * lado
                Escribir "�rea del cuadrado: ", area
            2:
                Escribir "Ingrese la base del rect�ngulo: "
                Leer baseR
                Escribir "Ingrese la altura del rect�ngulo: "
                Leer alturaR
                area <- baseR * alturaR
                Escribir "�rea del rect�ngulo: ", area
            3:
                Escribir "Ingrese la base del tri�ngulo: "
                Leer baseT
                Escribir "Ingrese la altura del tri�ngulo: "
                Leer alturaT
                area <- (baseT * alturaT) / 2
                Escribir "�rea del tri�ngulo: ", area
            4:
                Escribir "Ingrese el radio del c�rculo: "
                Leer radio
                area <- 3.1416 * radio * radio
                Escribir "�rea del c�rculo: ", area
            5:
                Escribir "Saliendo del programa..."
            De Otro Modo:
                Escribir "Opci�n inv�lida."
        FinSegun
		
        Si opcion <> 5 Entonces
            Escribir "�Desea calcular otra �rea? (s/n): "
            Leer continuar
        SiNo
            continuar <- "n"
        FinSi
    Hasta Que continuar = "n" O continuar = "N"
	
    Escribir "Programa finalizado."
FinAlgoritmo
