import java.util.Scanner;

public class Bee_1000{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float x = scan.nextFloat();
        float y = scan.nextFloat();
        float z = scan.nextFloat();
        float media = ((x *2) + (y*3) + (z*5)) / 10;

        System.out.printf("MEDIA = %.1f%n", media );
    }
}