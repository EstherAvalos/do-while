
import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {
        int numero, aleatorio, contador=0;
        
        aleatorio=(int)( Math.random()*100);
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un nuúmero"));
            if (aleatorio>numero){
                JOptionPane.showMessageDialog(null, "Digie un numero mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Digite un numero menor");
            }
            contador++;
        } while(numero!=aleatorio);
        JOptionPane.showMessageDialog(null, "Genial adivinaste el numero en "+contador+ " intentos");
    }
}
