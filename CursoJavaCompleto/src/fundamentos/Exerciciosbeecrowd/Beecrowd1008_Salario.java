package fundamentos.Exerciciosbeecrowd;

import java.util.Scanner;

public class Beecrowd1008_Salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double salary = (b * c );

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();

    }
}
