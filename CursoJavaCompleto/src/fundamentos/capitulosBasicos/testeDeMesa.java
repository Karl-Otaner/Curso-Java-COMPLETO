package fundamentos.capitulosBasicos;

import java.util.Scanner;

public class testeDeMesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        while (x < 5){
            y = x * 3;
            System.out.println(y);
            x = x + 1;
        }

        System.out.println("Fim");

        sc.close();
    }
}
