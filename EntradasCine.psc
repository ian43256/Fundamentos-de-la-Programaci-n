Proceso EntradasCine
	Definir personas, parejas, individuales Como Entero;
	Definir dia, membresiaStr Como Cadena;
	Definir tieneMembresia Como Logico;
	Definir precioTotal Como Real;
	
	Escribir "Ingresa el numero de personas: ";
	Leer personas;
	
	Escribir "Ingresa el dia de la semana: ";
	Leer dia;
	
	Escribir "¿Tienes membresia? (si/no): ";
	Leer membresiaStr;
	
	dia <- Minusculas(dia);
	membresiaStr <- Minusculas(membresiaStr);
	
	precioTotal <- 0;
	
	Segun dia Hacer
		"miercoles":
			precioTotal <- personas * 30;
		"jueves":
			parejas <- personas / 2;
			individuales <- personas MOD 2;
			precioTotal <- parejas * 75 + individuales * 50;
		De Otro Modo:
			precioTotal <- personas * 50;
	FinSegun;
	
	Si membresiaStr = "si" Entonces
		precioTotal <- precioTotal * 0.9;
	FinSi;
	
	Escribir "El precio total de las entradas es: $", precioTotal;
FinProceso