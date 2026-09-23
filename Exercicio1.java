import java.util.Scanner;

public class Exercicio1 {
    public static double paraFahrenheit(double c) { return c * 1.8 + 32; }
    public static double paraKelvin(double c) { return c + 273.15; }
    public static double paraReaumur(double c) { return c * 0.8; }
    public static double paraRankine(double c) { return c * 1.8 + 491.67; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = sc.nextDouble();
        
        System.out.printf("Fahrenheit: %.3f\n", paraFahrenheit(c));
        System.out.printf("Kelvin: %.2f\n", paraKelvin(c));
        System.out.printf("Réaumur: %.3f\n", paraReaumur(c));
        System.out.printf("Rankine: %.3f\n", paraRankine(c));
    }
}