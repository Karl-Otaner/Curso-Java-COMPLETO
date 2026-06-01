package fundamentos.introducaoPOO.application;


import fundamentos.introducaoPOO.entities.SobrecargaProduct;

import java.util.Locale;
import java.util.Scanner;

public class SobrecargaExemplo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SobrecargaProduct p = new SobrecargaProduct();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name3 = sc.nextLine();

        System.out.print("Price: ");
        double price3 = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        SobrecargaProduct product3 = new SobrecargaProduct(name3, price3);

        System.out.println();
        System.out.println("Product data: " + product3);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity3 = sc.nextInt();
        product3.addProducts(quantity3);


        System.out.println();
        System.out.println("Updated data: " + product3);


        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity3 = sc.nextInt();
        product3.removeProducts(quantity3);

        System.out.println();
        System.out.println("Upadate data: " + product3);

        sc.close();
    }
}

