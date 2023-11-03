import java.util.Scanner;
public class Bee2164 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        double formula1 = Math.pow(((1 + Math.pow(5 ,0.5))/2), x);
        double formula2 = Math.pow(((1 - Math.pow(5 ,0.5))/2), x);
        double formulag = (formula1 - formula2)/Math.pow(5,0.5);

        System.out.println(String.format("%.1f",formulag));


    }
}
