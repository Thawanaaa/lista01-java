import java.util.Scanner;

public class Exercicio9 {
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    public static String determinarSituacao(double media) {
        if (media >= 7) return "Aprovado";
        else if (media >= 5) return "Recuperação";
        else return "Reprovado";
    }
    public static double mediaGeral(double[] medias) {
        double soma = 0;
        for (double m : medias) soma += m;
        return soma / medias.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        double[] medias = new double[qtd];
        
        for (int i = 0; i < qtd; i++) {
            double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
            medias[i] = calcularMedia(n1, n2, n3);
            System.out.printf("Aluno %d Média: %.1f\n", i + 1, medias[i]);
            System.out.println(determinarSituacao(medias[i]));
        }
        System.out.printf("Média geral da turma: %.1f\n", mediaGeral(medias));
    }
}