import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args) {
        int num, cuadrado;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (num>=0) {
            cuadrado=(int)Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, "El numero"+ num+ "elevado al cuadrado es: "+cuadrado);

            num=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
    }
}
