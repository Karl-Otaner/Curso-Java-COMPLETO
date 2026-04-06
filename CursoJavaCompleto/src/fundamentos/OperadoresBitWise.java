package fundamentos;
/*
Operadores bitwise
Operador Significado
& Operação "E" bit a bit
| Operação "OU" bit a bit
^ Operação "OU-exclusivo" bit a bit
C1 C2 C1 E C2
F   F   F
F   V   F
V   F   F
V   V   V
C1 C2 C1 OU C2
F   F    F
F   V    V
V   F    V
V   V   V
C1 C2 C1 XOR C2
F   F   F
F   V   V
V   F   V
V   V   F
Demo
0101 1001       &: 0001 1000    (24)
                |: 0111 1101    (125)
0011 1100       ^: 0110 0101    (101)

 */

public class OperadoresBitWise {
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
    }
}
