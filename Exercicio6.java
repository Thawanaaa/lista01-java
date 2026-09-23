import java.util.Scanner;

public class Exercicio6 {
    public static double calcularPotenciaHP(double massa, double altura, double tempo) {
        double p = (massa * 9.81 * altura) / tempo;
        return p / 745.6999;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massa: "); double m = sc.nextDouble();
        System.out.print("Altura: "); double h = sc.nextDouble();
        System.out.print("Tempo: "); double t = sc.nextDouble();
        
        System.out.printf("Potência necessária: %.3f hp\n", calcularPotenciaHP(m, h, t));
    }
}