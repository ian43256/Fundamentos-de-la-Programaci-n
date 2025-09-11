Algoritmo CalculadoraBasicaDoWhile
    Definir num1, num2 Como Entero
    Definir operacion, continuar Como Caracter
	
    Repetir
        Escribir "Ingrese el primer n�mero: "
        Leer num1
		
        Escribir "Ingrese el segundo n�mero: "
        Leer num2
		
        Escribir "Ingrese la operaci�n (+, -, *, /): "
        Leer operacion
		
        Segun operacion Hacer
            '+':
                Escribir "Resultado: ", num1 + num2
            '-':
                Escribir "Resultado: ", num1 - num2
            '*':
                Escribir "Resultado: ", num1 * num2
            '/':
                Si num2 <> 0 Entonces
                    Escribir "Resultado: ", num1 / num2
                SiNo
                    Escribir "Error: Divisi�n por cero."
                FinSi
            De Otro Modo:
                Escribir "Operador inv�lido."
        FinSegun
		
        Escribir "�Desea hacer otra operaci�n? (s/n): "
        Leer continuar
    Hasta Que continuar = "n" O continuar = "N"
	
    Escribir "Programa finalizado."
FinAlgoritmo

