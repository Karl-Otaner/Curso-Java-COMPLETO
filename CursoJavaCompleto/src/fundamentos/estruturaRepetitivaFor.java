package fundamentos;

/*
 estrutura
    for ( inicio; condição; incremento) {
    comando 1
    comando 2
    }
 */

public class estruturaRepetitivaFor {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        //i = i + 1
        for (int i= 0; i<N; i++ ){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        sc.close();

        // Crescende
        for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
        }

        // decrescente

        for (int i=4; i>=0; i--){
            System.out.println("Valor de i: " + i);
        }
*/
        int x = 4;
        int y = x + 2;
        for (int i = 0; i<x; i++) {
            System.out.print(x+" "+y);
            y = y + i;
        }
    }
}
