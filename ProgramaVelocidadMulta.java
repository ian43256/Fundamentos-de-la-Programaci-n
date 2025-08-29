import javax.swing.JOptionPane;

public class ProgramaVelocidadMulta {
    public static void main(String[] args) {
     
        String inputVelocidad = JOptionPane.showInputDialog("Ingresa la velocidad");
        int velocidad = Integer.parseInt(inputVelocidad);

       
        String cumple = JOptionPane.showInputDialog("¿Es tu cumpleaños? (si/no)");


        if (cumple.equalsIgnoreCase("si")) {
            JOptionPane.showMessageDialog(null, "No tienes multa, Feliz cum.");
        
        }
        else {
        if (velocidad < 60) {
            JOptionPane.showMessageDialog(null, "No tienes multa.");
        } else if (velocidad >= 60 && velocidad <= 80) {
            JOptionPane.showMessageDialog(null, "Tienes una multa pequeña.");
        } else {
            JOptionPane.showMessageDialog(null, "Tienes una multa grande.");
}
}
}
}

