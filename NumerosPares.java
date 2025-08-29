import javax.swing.JOptionPane;

public class NumerosPares {
    public static void main(String[] args) {
    
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de b:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de c:"));
        
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        int resultado;

        if (ab == 10 || bc == 10 || ac == 10) {
            resultado = 10;
        } else if (ab == ac + 10 || ab == bc + 10) {
            resultado = 5;
        } else {
            resultado = 0;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
}
}