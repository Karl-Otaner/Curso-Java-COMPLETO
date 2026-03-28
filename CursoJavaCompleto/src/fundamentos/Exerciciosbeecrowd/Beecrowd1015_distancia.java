package fundamentos.Exerciciosbeecrowd;

/*
Explicação da Lógica
Velocidades: O carro X está a 60 km/h e o carro Y a 90 km/h.
Diferença: O carro Y é 30 km/h mais rápido. Isso significa que ele ganha 30 km de vantagem a cada 60 minutos.
Proporção: Se ele ganha 30 km em 60 min, ele leva exatos 2 minutos para cada 1 km de distância.
Cálculo: Portanto,
    */

import java.util.Scanner;

public class Beecrowd1015_distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();

        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
