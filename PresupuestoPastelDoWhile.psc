Proceso PresupuestoPastelDoWhile
    Definir sabor, chocolate, snack, nombre, continuar Como Cadena
    Definir precioTotal Como Real
	
    Repetir
        precioTotal <- 0
		
        Repetir
            Escribir "Seleccione el sabor del pastel (manzana, fresa, chocolate): "
            Leer sabor
            sabor <- Minusculas(sabor)
            Si sabor <> "manzana" Y sabor <> "fresa" Y sabor <> "chocolate" Entonces
                Escribir "Opción inválida. Intente de nuevo."
            FinSi
        Hasta Que sabor = "manzana" O sabor = "fresa" O sabor = "chocolate"

        Segun sabor Hacer
            "manzana":
                precioTotal <- 200
            "fresa":
                precioTotal <- 250
            "chocolate":
                Repetir
                    Escribir "Seleccione el tipo de chocolate (negro/blanco): "
                    Leer chocolate
                    chocolate <- Minusculas(chocolate)
                    Si chocolate <> "negro" Y chocolate <> "blanco" Entonces
                        Escribir "Opción inválida. Intente de nuevo."
                    FinSi
                Hasta Que chocolate = "negro" O chocolate = "blanco"
				
                Si chocolate = "negro" Entonces
                    precioTotal <- 280
                Sino
                    precioTotal <- 300
                FinSi
        FinSegun
		
        Escribir "¿Desea añadir snack? (si/no): "
        Leer snack
        snack <- Minusculas(snack)
        Si snack = "si" Entonces
            Escribir "Ingrese el tipo de snack: "
            Leer snack
            precioTotal <- precioTotal + 25
        FinSi
		
        Escribir "¿Desea personalizar el pastel con un nombre? (si/no): "
        Leer nombre
        nombre <- Minusculas(nombre)
        Si nombre = "si" Entonces
            precioTotal <- precioTotal + 30
        FinSi
		
        Escribir "El precio total del pastel es: $", precioTotal
		
        Escribir "¿Desea realizar otro presupuesto? (si/no): "
        Leer continuar
        continuar <- Minusculas(continuar)
    Hasta Que continuar = "no"
	
FinProceso

