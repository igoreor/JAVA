import java.util.Scanner;
public class Bee1042 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int inicio,meio,fina;

        if(a<b && a<c){
            fina = a;
            if(b>c){
                inicio = b;
                meio = c;
                System.out.println(fina+"\n"+meio+"\n"+inicio+"\n");
                System.out.println(a+"\n"+b+"\n"+c);
            } else {
                inicio = c;
                meio = b;
                System.out.println(fina+"\n"+meio+"\n"+inicio+"\n");
                System.out.println(a+"\n"+b+"\n"+c);
            }
        } else if (b<c && b<a){
            fina = b;
            if(a>c){
                inicio = a;
                meio = c;
                System.out.println(fina+"\n"+meio+"\n"+inicio+"\n");
                System.out.println(a+"\n"+b+"\n"+c);
            } else {
                inicio = c;
                meio = a;
                System.out.println(fina+"\n"+meio+"\n"+inicio+"\n");
                System.out.println(a+"\n"+b+"\n"+c);
            }
        }else {
            fina = c;
            if(a>b){
                inicio = a;
                meio = b;
                System.out.println(fina+"\n"+meio+"\n"+inicio+"\n");
                System.out.println(a+"\n"+b+"\n"+c);
            } else {
                inicio = b;
                meio = c;
                System.out.println(fina+"\n"+meio+"\n"+inicio+"\n");
                System.out.println(a+"\n"+b+"\n"+c);
            }

        }
    }
}
