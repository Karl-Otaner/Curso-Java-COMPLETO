package fundamentos.exerciciosBeecrowd;

import java.util.Scanner;

public class Beecrowd1005_Media1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A= sc.nextDouble() * 3.5;
        double B= sc.nextDouble() * 7.5;

        double MEDIA = (A + B )/11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);

        sc.close();
    }
}
