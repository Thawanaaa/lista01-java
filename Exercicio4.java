import java.util.Scanner;

public class Exercicio4 {
    public static int calcularAzulejos(double altParede, double largParede, double altAzulejo, double largAzulejo) {
        double areaParede = altParede * largParede;
        double areaAzulejo = altAzulejo * largAzulejo;
        return (int) Math.ceil(areaParede / areaAzulejo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura da parede: "); double ap = sc.nextDouble();
        System.out.print("Largura da parede: "); double lp = sc.nextDouble();
        System.out.print("Altura do azulejo: "); double aa = sc.nextDouble();
        System.out.print("Largura do azulejo: "); double la = sc.nextDouble();
        
        System.out.println("Quantidade de azulejos necessários: " + calcularAzulejos(ap, lp, aa, la));
    }
}