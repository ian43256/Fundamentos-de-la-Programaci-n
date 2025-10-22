import java.util.Scanner;

public class MatrizIan {
    static int filas = 5;
    static int columnas = 4;
    static int[][] matriz = new int[filas][columnas];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenu de Matrices");
            System.out.println("1. Insertar valores");
            System.out.println("2. Buscar valor");
            System.out.println("3. Eliminar valor");
            System.out.println("4. Modificar valor");
            System.out.println("5. Mostrar matriz");
            System.out.println("6. Eliminar todo");
            System.out.println("7. Ordenar matriz");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    insertar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    eliminarTodo();
                    break;
                case 7:
                    ordenar();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 8);
    }
    
    static void insertar() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print("Ingrese un valor para la posición [" + f + "][" + c + "]: ");
                matriz[f][c] = sc.nextInt();
            }
        }
        System.out.println("Valores insertados correctamente.");
    }
    
    static void buscar() {
        System.out.print("Ingrese el valor a buscar: ");
        int valor = sc.nextInt();
        boolean encontrado = false;
        String posiciones = "";

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (matriz[f][c] == valor) {
                    encontrado = true;
                    posiciones += "[" + f + "][" + c + "] ";
                }
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado en: " + posiciones);
        } else {
            System.out.println("El valor no existe en la matriz.");
        }
    }
    
    static void eliminar() {
        System.out.print("Ingrese el valor a eliminar: ");
        int valor = sc.nextInt();
        boolean eliminado = false;

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (matriz[f][c] == valor) {
                    matriz[f][c] = 0; 
                    eliminado = true;
                }
            }
        }

        if (eliminado) {
            System.out.println("Valor eliminado correctamente (reemplazado por 0).");
        } else {
            System.out.println("El valor no fue encontrado.");
        }
    }

    static void modificar() {
        System.out.print("Ingrese el valor que desea modificar: ");
        int valor = sc.nextInt();
        boolean encontrado = false;

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (matriz[f][c] == valor) {
                    System.out.print("Ingrese el nuevo valor para la posición [" + f + "][" + c + "]: ");
                    int nuevoValor = sc.nextInt();
                    matriz[f][c] = nuevoValor;
                    encontrado = true;
                }
            }
        }

        if (encontrado) {
            System.out.println("Valor modificado correctamente.");
        } else {
            System.out.println("El valor no fue encontrado.");
        }
    }
    
    static void mostrar() {
        System.out.println("\nContenido de la matriz:");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }
    }
    
    static void eliminarTodo() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz[f][c] = 0;
            }
        }
        System.out.println("Toda la matriz ha sido vaciada (reiniciada).");
    }
    
    static void ordenar() {
        int total = filas * columnas;
        int[] temp = new int[total];
        int index = 0;
        
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                temp[index++] = matriz[f][c];
            }
        }
        
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    int aux = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = aux;
                }
            }
        }
        
        index = 0;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz[f][c] = temp[index++];
            }
        }

        System.out.println("La matriz ha sido ordenada correctamente.");
    }
}