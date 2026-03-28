package fundamentos.Exerciciosbeecrowd;

import java.util.Scanner;

public class Beecrowd1014_consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;

        a = sc.nextInt();
        b = sc.nextDouble();

        double consumo = (a / b);

        System.out.printf("%.3f km/l%n", consumo);
        sc.close();
    }
}
