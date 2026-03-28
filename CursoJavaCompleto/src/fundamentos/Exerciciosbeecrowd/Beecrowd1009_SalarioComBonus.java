package fundamentos.Exerciciosbeecrowd;

import java.util.Scanner;

public class Beecrowd1009_SalarioComBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nome = sc.next();

        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble() * 0.15;

        double total = salarioFixo + totalVendas;

        System.out.printf("TOTAL = R$ %.2f%n", total);
        sc.close();
    }
}
