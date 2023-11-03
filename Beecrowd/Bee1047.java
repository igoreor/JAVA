import java.util.Scanner;

public class Bee1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler a hora inicial, minuto inicial, hora final e minuto final
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        // Calcular a duração do jogo em minutos
        int inicioMinutos = horaInicial * 60 + minutoInicial;
        int finalMinutos = horaFinal * 60 + minutoFinal;
        int duracaoMinutos = finalMinutos - inicioMinutos;

        // Verificar se a duração é negativa (ocorre no dia seguinte)
        if (duracaoMinutos <= 0) {
            duracaoMinutos += 24 * 60;  // Adicionar 24 horas em minutos
        }

        // Calcular as horas e minutos a partir dos minutos totais
        int duracaoHoras = duracaoMinutos / 60;
        int duracaoMinutosRestantes = duracaoMinutos % 60;

        // Exibir a mensagem formatada
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutosRestantes + " MINUTO(S)");
    }
}