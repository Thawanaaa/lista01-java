import java.util.Scanner;

public class Exercicio11 {
    public static int maiorNumero(int[] nums) {
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }
    public static int menorNumero(int[] nums) {
        int min = nums[0];
        for (int n : nums) if (n < min) min = n;
        return min;
    }
    public static int quantidadePares(int[] nums) {
        int cont = 0;
        for (int n : nums) if (n % 2 == 0) cont++;
        return cont;
    }
    public static double mediaNumeros(int[] nums) {
        double soma = 0;
        for (int n : nums) soma += n;
        return soma / nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) nums[i] = sc.nextInt();
        
        System.out.println("Maior número: " + maiorNumero(nums));
        System.out.println("Menor número: " + menorNumero(nums));
        System.out.println("Quantidade de pares: " + quantidadePares(nums));
        System.out.println("Média: " + mediaNumeros(nums));
    }
}