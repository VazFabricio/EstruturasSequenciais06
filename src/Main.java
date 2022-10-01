import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = 0.0;
        double area = 0.0;

        System.out.print("Qual o raio do circulo? ");
        raio = sc.nextDouble();

        area = Math.PI * (raio*raio);

        System.out.printf("A area do circulo e de: %.2f", area);

    }
}