import java.util.Scanner;

public class MatrizNumerosIan {
    static Scanner sc = new Scanner(System.in);
    static int[][] matriz = new int[4][4];
    static boolean datosIngresados = false;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMatriz 4x4");
            System.out.println("1. Rellenar toda la matriz (sin repetir valores)");
            System.out.println("2. Sumar cada fila y columna");
            System.out.println("3. Sumar una fila específica");
            System.out.println("4. Sumar una columna específica");
            System.out.println("5. Mostrar mayor y menor con posición");
            System.out.println("6. Contar cuántos son pares");
            System.out.println("7. Contar cuántos son impares");
            System.out.println("8. Generar nueva matriz con cuadrados");
            System.out.println("9. Sumar diagonal principal");
            System.out.println("10. Sumar diagonal inversa");
            System.out.println("11. Calcular media de todos los valores");
            System.out.println("12. Mostrar matriz original");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz();
                    break;
                case 2:
                    if (verificarDatos()) sumaFilasColumnas();
                    break;
                case 3:
                    if (verificarDatos()) sumaFilaEspecifica();
                    break;
                case 4:
                    if (verificarDatos()) sumaColumnaEspecifica();
                    break;
                case 5:
                    if (verificarDatos()) mayorYMenor();
                    break;
                case 6:
                    if (verificarDatos()) contarPares();
                    break;
                case 7:
                    if (verificarDatos()) contarImpares();
                    break;
                case 8:
                    if (verificarDatos()) matrizCuadrados();
                    break;
                case 9:
                    if (verificarDatos()) diagonalPrincipal();
                    break;
                case 10:
                    if (verificarDatos()) diagonalInversa();
                    break;
                case 11:
                    if (verificarDatos()) mediaMatriz();
                    break;
                case 12:
                    if (verificarDatos()) mostrarMatriz();
                    break;
                case 13:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 13);
    }

    static boolean verificarDatos() {
        if (!datosIngresados) {
            System.out.println("Debe rellenar primero la matriz (opción 1).");
            return false;
        }
        return true;
    }

    static void rellenarMatriz() {
        System.out.println("\nRellenar matriz 4x4 (sin números repetidos)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num;
                boolean repetido;
                do {
                    System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                    num = sc.nextInt();
                    repetido = existeNumero(num);
                    if (repetido) {
                        System.out.println("Ese número ya fue ingresado. Introduzca otro.");
                    }
                } while (repetido);
                matriz[i][j] = num;
            }
        }
        datosIngresados = true;
        System.out.println("\nMatriz rellenada correctamente.");
    }

    static boolean existeNumero(int num) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    static void mostrarMatriz() {
        System.out.println("\nMatriz actual:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void sumaFilasColumnas() {
        System.out.println("\nSuma de cada fila y columna:");
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        for (int j = 0; j < 4; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 4; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaCol);
        }
    }

    static void sumaFilaEspecifica() {
        int fila;
        do {
            System.out.print("Ingrese el número de fila (1-4): ");
            fila = sc.nextInt();
        } while (fila < 1 || fila > 4);

        int suma = 0;
        for (int j = 0; j < 4; j++) {
            suma += matriz[fila - 1][j];
        }
        System.out.println("La suma de la fila " + fila + " es: " + suma);
    }

    static void sumaColumnaEspecifica() {
        int col;
        do {
            System.out.print("Ingrese el número de columna (1-4): ");
            col = sc.nextInt();
        } while (col < 1 || col > 4);

        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][col - 1];
        }
        System.out.println("La suma de la columna " + col + " es: " + suma);
    }

    static void mayorYMenor() {
        int mayor = matriz[0][0], menor = matriz[0][0];
        int filaMayor = 0, colMayor = 0, filaMenor = 0, colMenor = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    colMayor = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }

        System.out.println("\nMayor: " + mayor + " en posición [" + filaMayor + "][" + colMayor + "]");
        System.out.println("Menor: " + menor + " en posición [" + filaMenor + "][" + colMenor + "]");
    }

    static void contarPares() {
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 == 0) contador++;
            }
        }
        System.out.println("Cantidad de números pares: " + contador);
    }

    static void contarImpares() {
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 != 0) contador++;
            }
        }
        System.out.println("Cantidad de números impares: " + contador);
    }

    static void matrizCuadrados() {
        System.out.println("\nMatriz con el cuadrado de los valores:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((matriz[i][j] * matriz[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    static void diagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal: " + suma);
    }

    static void diagonalInversa() {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][3 - i];
        }
        System.out.println("Suma de la diagonal inversa: " + suma);
    }

    static void mediaMatriz() {
        int suma = 0;
        int total = 4 * 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                suma += matriz[i][j];
            }
        }
        double media = (double) suma / total;
        System.out.println("La media de todos los valores de la matriz es: " + media);
    }
}