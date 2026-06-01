package fundamentos.introducaoPOO.application;

import fundamentos.introducaoPOO.entities.EncapsulamentoProduct;
import fundamentos.introducaoPOO.entities.SobrecargaProduct;

import java.util.Locale;
import java.util.Scanner;

public class EncapsulamentoExemplo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SobrecargaProduct p = new SobrecargaProduct();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");

        String name = sc.nextLine();
        System.out.print("Price: ");

        double price = sc.nextDouble();

        EncapsulamentoProduct product = new EncapsulamentoProduct(name, price);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
