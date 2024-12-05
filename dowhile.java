import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
         Scanner enetrada = new Scanner(System.in);
         int i=1, contador;
         System.out.println("Digite la cantidad de terminos:");
         contador= enetrada.nextInt();
         do {
            System.out.println(i);
            i+=3;
         } while (i<=contador);
    }
}