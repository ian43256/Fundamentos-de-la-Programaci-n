Algoritmo CalculadoraBasicaDoWhile
    Definir num1, num2 Como Entero
    Definir operacion, continuar Como Caracter
	
    Repetir
        Escribir "Ingrese el primer número: "
        Leer num1
		
        Escribir "Ingrese el segundo número: "
        Leer num2
		
        Escribir "Ingrese la operación (+, -, *, /): "
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
                    Escribir "Error: División por cero."
                FinSi
            De Otro Modo:
                Escribir "Operador inválido."
        FinSegun
		
        Escribir "¿Desea hacer otra operación? (s/n): "
        Leer continuar
    Hasta Que continuar = "n" O continuar = "N"
	
    Escribir "Programa finalizado."
FinAlgoritmo

