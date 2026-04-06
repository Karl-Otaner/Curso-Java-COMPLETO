package fundamentos.exerciciosBeecrowd;

import java.util.Scanner;

public class Beecrowd1012_Areas {
    /*
a) a área do triângulo retângulo que tem A por base e C por altura. A = b x h / 2
b) a área do círculo de raio C. (pi = 3.14159) A = pi x r2
c) a área do trapézio que tem A e B por bases e C por altura. A = (B + b) x H / 2
d) a área do quadrado que tem lado B. A = l2, ou A = l x l
e) a área do retângulo que tem lados A e B. A = b x h

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pi = 3.14159;

        double aTriRetangulo = (A * C) / 2;
        double aCirculo = pi * Math.pow(C, 2);
        double aTrapezio = (A + B) * C / 2;
        double aQuadrado = Math.pow(B,2);
        double aRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", aTriRetangulo);
        System.out.printf("CICULO: %.3f%n", aCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
        System.out.printf("QUADRADO: %.3f%n", aQuadrado);
        System.out.printf("RETANGULO: %.3f%n", aRetangulo);

        sc.close();
    }
}
