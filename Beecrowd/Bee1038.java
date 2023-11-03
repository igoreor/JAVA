import java.util.Scanner;
public class Bee1038     {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valor ;

        int a = s.nextInt();
        int b = s.nextInt();

        if (a == 1) {
            valor = 4 * b;
            System.out.printf("Total: R$ %.2f%n", valor);
        } else if (a == 2) {
            valor = 4.50 * b;
            System.out.printf("Total: R$ %.2f%n", valor);

        } else if (a == 3) {
            valor = 5 * b;
            System.out.printf("Total: R$ %.2f%n", valor);

        } else if (a == 4) {
            valor = 2 * b;
            System.out.printf("Total: R$ %.2f%n", valor);

        } else{
            valor = 1.5 * b;
            System.out.printf("Total: R$ %.2f%n", valor);
        }
    }


}
