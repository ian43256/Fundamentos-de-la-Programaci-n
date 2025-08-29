import javax.swing.JOptionPane;

public class MesesConteo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un número entre el 1 y 12:");
        int mes = Integer.parseInt(input);

        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Ese no es el número de un mes.");
        } else {
            String nombreMes = "";
            int dias = 0;

            switch (mes) {
                case 1: nombreMes = "Enero"; dias = 31; 
                break;
                case 2: nombreMes = "Febrero"; dias = 28; 
                break;
                case 3: nombreMes = "Marzo"; dias = 31; 
                break;
                case 4: nombreMes = "Abril"; dias = 30; 
                break;
                case 5: nombreMes = "Mayo"; dias = 31; 
                break;
                case 6: nombreMes = "Junio"; dias = 30; 
                break;
                case 7: nombreMes = "Julio"; dias = 31; 
                break;
                case 8: nombreMes = "Agosto"; dias = 31; 
                break;
                case 9: nombreMes = "Septiembre"; dias = 30; 
                break;
                case 10: nombreMes = "Octubre"; dias = 31; 
                break;
                case 11: nombreMes = "Noviembre"; dias = 30; 
                break;
                case 12: nombreMes = "Diciembre"; dias = 31; 
                break;
            }

            JOptionPane.showMessageDialog(null, "El mes " + nombreMes + " tiene " + dias + " días.");
 }
}
}