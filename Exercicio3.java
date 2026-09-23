import java.util.Scanner;

public class Exercicio3 {
    public static double calcularMedia(double[] salarios) {
        double soma = 0;
        for (double s : salarios) soma += s;
        return soma / salarios.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        double[] salarios = new double[qtd];
        
        for (int i = 0; i < qtd; i++) salarios[i] = sc.nextDouble();
        
        System.out.printf("Média salarial: %.2f\n", calcularMedia(salarios));
    }
}