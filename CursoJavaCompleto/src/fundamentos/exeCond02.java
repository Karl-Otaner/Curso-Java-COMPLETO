package fundamentos;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

import java.util.Scanner;

public class exeCond02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }


        sc.close();
    }

}
