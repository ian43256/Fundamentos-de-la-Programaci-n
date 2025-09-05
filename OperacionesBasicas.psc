Proceso OperacionesBasicas
    Definir num1, num2, resultado Como Entero;
    Definir operacion Como Caracter;
    Definir resultadoDiv Como Real;
	
    Escribir "Ingrese el primer número: ";
    Leer num1;
	
    Escribir "Ingrese el segundo número: ";
    Leer num2;
	
    Escribir "Ingrese la operación a realizar (+, -, *, /): ";
    Leer operacion;
	
    Segun operacion Hacer
        '+':
            resultado <- num1 + num2;
            Escribir "Resultado de la suma: ", resultado;
        '-':
            resultado <- num1 - num2;
            Escribir "Resultado de la resta: ", resultado;
        '*':
            resultado <- num1 * num2;
            Escribir "Resultado de la multiplicación: ", resultado;
        '/':
            Si num2 <> 0 Entonces
                resultadoDiv <- num1 / num2;
                Escribir "Resultado de la división: ", resultadoDiv;
            Sino
                Escribir "Error: división por cero no permitida.";
            FinSi;
        De Otro Modo:
            Escribir "Operación no válida.";
    FinSegun;
FinProceso