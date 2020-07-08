package avaliaçãofinal.pkg6;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class AvaliaçãoFinal6 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("0.0");
        double P, A, D, pi, r;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio do circulo:"));
        
        pi = 3.14;
        P = 2*pi*r;
        A = pi*Math.pow(r, 2);
        D = 2*r;
        
        JOptionPane.showMessageDialog(null, "Resulatados:\n_________________________________\nPerímetro: "+f.format(P)+"\nÁrea: "+f.format(A)+"\nDiâmetro: "+f.format(D));
    }
}
