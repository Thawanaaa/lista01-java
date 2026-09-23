import java.util.Scanner;

public class Exercicio7 {
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) return 1;
        long fat = 1;
        for (int i = 2; i <= n; i++) fat *= i;
        return fat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fatorial: " + calcularFatorial(n));
    }
}