package fundamentos.introducaoPOO.application;

import fundamentos.introducaoPOO.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1AreaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle  retac = new Rectangle();

        System.out.println("Enter rectangle width and heigth");
        retac.width = sc.nextDouble();
        retac.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", retac.area());
        System.out.printf("Perimeter = %.2f%n",retac.perimeter());
        System.out.printf("Diagonal = %.2f%n", retac.diagonal());


        sc.close();
    }
}
