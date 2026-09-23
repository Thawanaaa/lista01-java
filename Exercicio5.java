import java.util.Scanner;

public class Exercicio5 {
    public static double calcularVolume(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Raio: "); double r = sc.nextDouble();
        System.out.print("Altura: "); double a = sc.nextDouble();
        
        System.out.printf("Volume da lata de óleo: %.2f m³\n", calcularVolume(r, a));
    }
}