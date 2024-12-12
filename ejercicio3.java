import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {
        int num, suma=0;
        do{
          num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));  
         if(num>0){
            suma+=num;
         }

        } while(num!=0);
        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: "+suma);
        

    }
}
