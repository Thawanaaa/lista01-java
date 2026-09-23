import java.util.Scanner;

public class Exercicio2 {
    public static double maiorAltura(double[] alturas) {
        double max = alturas[0];
        for (double a : alturas) if (a > max) max = a;
        return max;
    }
    public static double menorAltura(double[] alturas) {
        double min = alturas[0];
        for (double a : alturas) if (a < min) min = a;
        return min;
    }
    public static double mediaAlturaHomens(int[] sexos, double[] alturas) {
        double soma = 0; int cont = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 2) { soma += alturas[i]; cont++; }
        }
        return cont > 0 ? soma / cont : 0;
    }
    public static int quantidadeMulheres(int[] sexos) {
        int cont = 0;
        for (int s : sexos) if (s == 1) cont++;
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sexos = new int[10];
        double[] alturas = new double[10];
        
        for (int i = 0; i < 10; i++) {
            sexos[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
        }
        
        System.out.printf("Maior altura: %.2f m\n", maiorAltura(alturas));
        System.out.printf("Menor altura: %.2f m\n", menorAltura(alturas));
        System.out.printf("Média de altura dos homens: %.2f m\n", mediaAlturaHomens(sexos, alturas));
        System.out.println("Número de mulheres: " + quantidadeMulheres(sexos));
    }
}