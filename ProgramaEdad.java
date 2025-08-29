import javax.swing.JOptionPane;

public class ProgramaEdad {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa tu edad");
        int edad = Integer.parseInt(input);

        if (edad < 18) {
            JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        } else if (edad >= 18 && edad <= 65) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad.");
        } else {
            JOptionPane.showMessageDialog(null, "Eres un adulto mayor.");
}
}
}
