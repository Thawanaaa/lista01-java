import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio12 {
    public static int calcularSoma(ArrayList<Integer> nums) {
        int soma = 0;
        for (int n : nums) soma += n;
        return soma;
    }
    public static double calcularMedia(ArrayList<Integer> nums, int soma) {
        return nums.isEmpty() ? 0 : (double) soma / nums.size();
    }
    public static int maiorNumero(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int n : nums) if (n > max) max = n;
        return max;
    }
    public static int menorNumero(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int n : nums) if (n < min) min = n;
        return min;
    }
    public static int quantidadePares(ArrayList<Integer> nums) {
        int cont = 0;
        for (int n : nums) if (n % 2 == 0) cont++;
        return cont;
    }
    public static int quantidadeImpares(ArrayList<Integer> nums) {
        int cont = 0;
        for (int n : nums) if (n % 2 != 0) cont++;
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int entrada;
        
        while ((entrada = sc.nextInt()) != -1) {
            nums.add(entrada);
        }
        
        if (!nums.isEmpty()) {
            int soma = calcularSoma(nums);
            System.out.println("Quantidade de números: " + nums.size());
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + calcularMedia(nums, soma));
            System.out.println("Maior número: " + maiorNumero(nums));
            System.out.println("Menor número: " + menorNumero(nums));
            System.out.println("Quantidade de pares: " + quantidadePares(nums));
            System.out.println("Quantidade de ímpares: " + quantidadeImpares(nums));
        }
    }
}