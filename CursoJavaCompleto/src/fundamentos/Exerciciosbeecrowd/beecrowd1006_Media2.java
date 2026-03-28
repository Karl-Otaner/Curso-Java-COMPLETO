package fundamentos.Exerciciosbeecrowd;

import java.util.Scanner;

public class beecrowd1006_Media2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble() * 2;
        double B = sc.nextDouble() * 3;
        double C = sc.nextDouble() * 5;

        double MEDIA = (A + B + C) / 10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);

        sc.close();
    }
}
