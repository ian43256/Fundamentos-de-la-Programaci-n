Proceso OperacionesBasicas
    Definir num1, num2, resultado Como Entero;
    Definir operacion Como Caracter;
    Definir resultadoDiv Como Real;
	
    Escribir "Ingrese el primer n�mero: ";
    Leer num1;
	
    Escribir "Ingrese el segundo n�mero: ";
    Leer num2;
	
    Escribir "Ingrese la operaci�n a realizar (+, -, *, /): ";
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
            Escribir "Resultado de la multiplicaci�n: ", resultado;
        '/':
            Si num2 <> 0 Entonces
                resultadoDiv <- num1 / num2;
                Escribir "Resultado de la divisi�n: ", resultadoDiv;
            Sino
                Escribir "Error: divisi�n por cero no permitida.";
            FinSi;
        De Otro Modo:
            Escribir "Operaci�n no v�lida.";
    FinSegun;
FinProceso