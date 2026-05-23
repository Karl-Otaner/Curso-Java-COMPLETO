package fundamentos.introducaoPOO.application;

import fundamentos.introducaoPOO.Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class lerContacaoDolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dólar? ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantos dólares você vai comprar? ");
        double quantidade = sc.nextDouble();

        double resultado = CurrencyConverter.valorFinal(cotacao, quantidade);

        System.out.printf("Quantos dólares você vai comprar: %.2f%n", resultado);

        sc.close();
    }
}
