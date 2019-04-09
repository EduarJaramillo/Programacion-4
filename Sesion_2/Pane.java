
package Sesion_2;
import javax.swing.JOptionPane;
/**
 *
 * @author Eduar
 */

public class Pane {
    public static void main(String[] args) {
        String Palabra_1 = "";
        Palabra_1 =JOptionPane.showInputDialog("Ingrese primer palabra: ");
        String Palabra_2 = "";
        Palabra_2 =JOptionPane.showInputDialog("Ingrese segunda palabra: ");
        String Palabra_3 = "";
        Palabra_3 =JOptionPane.showInputDialog("Ingrese tercer palabra: ");

        String Mensaje = (Palabra_1 + " " + Palabra_2+ " " + Palabra_3);
        JOptionPane.showMessageDialog(null, Mensaje);
    }
}