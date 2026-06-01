package fundamentos.introducaoPOO.application;


import fundamentos.introducaoPOO.entities.ConstrutoresProduct;

import java.util.Locale;
import java.util.Scanner;

public class ConstrutoresExemplo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Price: ");
        double price2 = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity2 = sc.nextInt();
        ConstrutoresProduct product2 = new ConstrutoresProduct(name2, price2, quantity2);

        System.out.println();
        System.out.println("Product data: " + product2);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity2 = sc.nextInt();
        product2.addProducts(quantity2);


        System.out.println();
        System.out.println("Updated data: " + product2);


        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity2 = sc.nextInt();
        product2.removeProducts(quantity2);

        System.out.println();
        System.out.println("Upadate data: " + product2);

        sc.close();
    }
}

