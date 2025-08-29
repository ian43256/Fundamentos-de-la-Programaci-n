import javax.swing.JOptionPane;

public class PresupuestoPastel {
    public static void main(String[] args) {
     
        String sabor = JOptionPane.showInputDialog("¿Qué sabor quiere el pastel? (manzana, fresa, chocolate)").toLowerCase();
        double precio = 0;

        switch (sabor) {
            case "manzana":
                precio = 200;
                break;
            case "fresa":
                precio = 250;
                break;
            case "chocolate":
                String tipoChocolate = JOptionPane.showInputDialog("¿Qué tipo de chocolate? (negro o blanco)").toLowerCase();
                switch (tipoChocolate) {
                    case "negro":
                        precio = 280;
                        break;
                    case "blanco":
                        precio = 300;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tipo de chocolate no válido");
                        precio = 0;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sabor no válido");
                precio = 0;
        }

        String respuestaSnack = JOptionPane.showInputDialog("¿Desea añadir un snack de 25 pesos? (si/no)").toLowerCase();
        switch (respuestaSnack) {
            case "si":
                String snack = JOptionPane.showInputDialog("Ingrese el nombre del snack:");
                precio += 25;
                break;
            case "no":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Respuesta no válida");
        }

        String respuestaNombre = JOptionPane.showInputDialog("¿Desea personalizar el pastel con un nombre por 30 pesos? (si/no)").toLowerCase();
        switch (respuestaNombre) {
            case "si":
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre para el pastel:");
                precio += 30;
                break;
            case "no":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Respuesta no válida para personalización");
        }

        JOptionPane.showMessageDialog(null, "El precio total de su pastel es: $" + precio + " pesos.");
}
}