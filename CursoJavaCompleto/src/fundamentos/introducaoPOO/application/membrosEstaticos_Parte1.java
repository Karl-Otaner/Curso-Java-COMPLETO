package fundamentos.introducaoPOO.application;
/*
Membros estáticos
• Também chamados membros de classe
• Em oposição a membros e instância
• São membros que fazem sentido independentemente de objetos. Não
precisam de objeto para serem chamados. São chamados a partir do
próprio nome da classe.
• Aplicações comuns:
• Classes utilitárias
• Declaração de constantes
• Uma classe que possui somente membros estáticos, pode ser uma classe
estática também. Esta classe não poderá ser instanciada
 */

import fundamentos.introducaoPOO.Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class membrosEstaticos_Parte1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circuference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI);

        sc.close();
    }



}
