package fundamentos.Exerciciosbeecrowd;

import java.util.Scanner;

public class Beecrowd1010_CalculoSimples {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int codigoDaPeca1 = sc.nextInt();
    double qtdPeca1 = sc.nextDouble();
    double valorPeca1 = sc.nextDouble();

    int codigoDaPeca2 = sc.nextInt();
    double qtdPeca2 = sc.nextDouble();
    double valorPeca2 = sc.nextDouble();

    double valorSoma1 = qtdPeca1 * valorPeca1;
    double valorSoma2 = qtdPeca2 * valorPeca2;

    double valorTotal = valorSoma1 + valorSoma2;

    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);


    sc.close();
    }
}
