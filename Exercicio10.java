import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio10 {
    public static double calcularTotal(ArrayList<Double> precos) {
        double soma = 0;
        for (double p : precos) soma += p;
        return soma;
    }
    public static double calcularDesconto(double total) {
        if (total > 500) return total * 0.15;
        if (total > 200) return total * 0.10;
        return 0.0;
    }
    public static double calcularValorFinal(double total, double desconto) {
        return total - desconto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        double p;
        
        while ((p = sc.nextDouble()) != 0) {
            precos.add(p);
        }
        
        double total = calcularTotal(precos);
        double desconto = calcularDesconto(total);
        double finalValor = calcularValorFinal(total, desconto);
        
        System.out.printf("Total da compra: %.2f\n", total);
        System.out.printf("Desconto: %.2f\n", desconto);
        System.out.printf("Valor final: %.2f\n", finalValor);
    }
}