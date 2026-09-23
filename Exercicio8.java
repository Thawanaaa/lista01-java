import java.util.Scanner;

public class Exercicio8 {
    public static int calcularHoras(int s) { return s / 3600; }
    public static int calcularMinutos(int s) { return (s % 3600) / 60; }
    public static int calcularSegundos(int s) { return (s % 3600) % 60; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSegundos = sc.nextInt();
        
        System.out.println(calcularHoras(totalSegundos) + " hora(s)");
        System.out.println(calcularMinutos(totalSegundos) + " minuto(s)");
        System.out.println(calcularSegundos(totalSegundos) + " segundo(s)");
    }
}