
import javax.swing.JOptionPane;

public class ColasIan {

    final int MAX = 10;
    int[] cola = new int[MAX];
    int frente = -1;
    int fin = -1;

    public static void main(String[] args) {
        ColasIan programa = new ColasIan();
        programa.menu();
    }

    public void menu() {
        int opcion = 0;
        do {
            String menu = """
                    Menú de Colas - Programa de Ian
                    
                    1. Insertar elemento
                    2. Eliminar elemento
                    3. Mostrar el primero
                    4. Mostrar todos los elementos
                    5. Verificar si está vacía
                    6. Verificar si está llena
                    7. Salir
                    """;

            String input = JOptionPane.showInputDialog(null, menu, "Colas", JOptionPane.INFORMATION_MESSAGE);
            if (input == null) break; 

            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> insertar();
                case 2 -> eliminar();
                case 3 -> mostrarPrimero();
                case 4 -> mostrarCola();
                case 5 -> estaVacia();
                case 6 -> estaLlena();
                case 7 -> JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcion != 7);
    }

    public void insertar() {
        if (fin == MAX - 1) {
            JOptionPane.showMessageDialog(null, "La cola está llena. No se puede insertar más.");
        } else {
            if (frente == -1) frente = 0;
            fin++;
            String numeroStr = JOptionPane.showInputDialog("Ingrese el número a insertar:");
            if (numeroStr == null) {
                fin--; 
                return;
            }
            try {
                int numero = Integer.parseInt(numeroStr);
                cola[fin] = numero;
                JOptionPane.showMessageDialog(null, "Elemento " + numero + " agregado a la cola.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido. Debes ingresar un número.");
                fin--;
            }
        }
    }

    public void eliminar() {
        if (frente == -1 || frente > fin) {
            JOptionPane.showMessageDialog(null, "La cola está vacía. No hay elementos para eliminar.");
        } else {
            JOptionPane.showMessageDialog(null, "Elemento eliminado: " + cola[frente]);
            frente++;
            if (frente > fin) {
                frente = fin = -1;
            }
        }
    }

    public void mostrarPrimero() {
        if (frente == -1) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else {
            JOptionPane.showMessageDialog(null, "Primer elemento de la cola: " + cola[frente]);
        }
    }

    public void mostrarCola() {
        if (frente == -1) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else {
            StringBuilder elementos = new StringBuilder("Elementos en la cola:\n");
            for (int i = frente; i <= fin; i++) {
                elementos.append("[").append(cola[i]).append("]\n");
            }
            JOptionPane.showMessageDialog(null, elementos.toString());
        }
    }

    public void estaVacia() {
        if (frente == -1) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else {
            JOptionPane.showMessageDialog(null, "La cola tiene elementos.");
        }
    }

    public void estaLlena() {
        if (fin == MAX - 1) {
            JOptionPane.showMessageDialog(null, "La cola está llena.");
        } else {
            JOptionPane.showMessageDialog(null, "La cola aún tiene espacio.");
        }
    }
}