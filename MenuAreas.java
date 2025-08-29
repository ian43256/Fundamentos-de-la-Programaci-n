import javax.swing.JOptionPane;

public class MenuAreas {
    public static void main(String[] args) {
        int opcion;
        double resultado = 0;

        String menu = "Cálculo de Áreas\n\n"
                + "1. Cuadrado\n"
                + "2. Rectángulo\n"
                + "3. Triángulo\n"
                + "4. Círculo\n"
                + "5. Salir\n\n"
                + "Elige una opción:";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1: 
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado:"));
                    resultado = lado * lado;
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + resultado);
                    break;

                case 2: 
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del rectángulo:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del rectángulo:"));
                    resultado = base * altura;
                    JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + resultado);
                    break;

                case 3: 
                    double baseT = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triángulo:"));
                    double alturaT = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triángulo:"));
                    resultado = (baseT * alturaT) / 2;
                    JOptionPane.showMessageDialog(null, "El área del triángulo es: " + resultado);
                    break;

                case 4: 
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del círculo:"));
                    resultado = Math.PI * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "El área del círculo es: " + resultado);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar mi calculadora de areas");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion!=5);
    }
}