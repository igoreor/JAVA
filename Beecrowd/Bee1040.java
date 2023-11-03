import java.util.Scanner;
public class Bee1040 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float d = s.nextFloat();

        float NotaParcial = ((a * 2) + (b*3)+ (c*4) + d ) ;
        float nota = (float) Math.floor(NotaParcial) / 10 ;

        System.out.println("Media: "+ nota );
        if (nota >= 7){
            System.out.println("Aluno aprovado.");

        } else if (nota>=5 && nota<=6.9){

            System.out.println("Aluno em exame.");

            float NovaNota = s.nextFloat();

            System.out.println("Nota do exame: "+ NovaNota);

            float mediaf = (nota + NovaNota) / 2;

            if (NovaNota>5){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+ mediaf);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: "+ mediaf);
            }

        } else{
            System.out.println("Aluno reprovado.");
        }







    }
}
