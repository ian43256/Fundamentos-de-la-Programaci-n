Algoritmo FabricaArticulosClave
    Definir clave, materiaPrima, manoObra, gastoFabricacion, costoProduccion, precioVenta Como Real;
	
    Escribir "Ingrese la clave del producto (1-6): ";
    Leer clave;
	
    Si clave < 1 O clave > 6 Entonces
        Escribir "Clave no válida. Intente con un valor entre 1 y 6.";
FinSi
Escribir "Ingrese el costo de la materia prima: ";
Leer materiaPrima;

Segun clave Hacer
	1:
		manoObra <- materiaPrima * 0.80;
		gastoFabricacion <- materiaPrima * 0.28;
	2:
		manoObra <- materiaPrima * 0.85;
		gastoFabricacion <- materiaPrima * 0.30;
	3:
		manoObra <- materiaPrima * 0.75;
		gastoFabricacion <- materiaPrima * 0.35;
	4:
		manoObra <- materiaPrima * 0.75;
		gastoFabricacion <- materiaPrima * 0.28;
	5:
		manoObra <- materiaPrima * 0.80;
		gastoFabricacion <- materiaPrima * 0.30;
	6:
		manoObra <- materiaPrima * 0.85;
		gastoFabricacion <- materiaPrima * 0.35;
FinSegun

costoProduccion <- materiaPrima + manoObra + gastoFabricacion;
precioVenta <- costoProduccion * 1.45;

Escribir "";
Escribir "Costos Totales";
Escribir "Clave del producto: ", clave;
Escribir "Materia prima: ", materiaPrima;
Escribir "Mano de obra: ", manoObra;
Escribir "Gastos de fabricación: ", gastoFabricacion;
Escribir "Costo de producción: ", costoProduccion;
Escribir "Precio de venta: ", precioVenta;
FinAlgoritmo