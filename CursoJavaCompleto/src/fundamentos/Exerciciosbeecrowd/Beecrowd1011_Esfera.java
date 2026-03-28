package fundamentos.Exerciciosbeecrowd;

import java.util.Scanner;

public class Beecrowd1011_Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        int r = sc.nextInt();

        double volume = (4/3.0) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}
