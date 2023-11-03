import java.util.Scanner;


public class Bee_1002 {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if(A > B && A > C){
            System.out.println(A + " eh o maior");
        }
        if(B > A && B > C){
            System.out.println(B + " eh o maior");
        }
        else{
            System.out.println(C + " eh o maior");
        }

        



    }

}
