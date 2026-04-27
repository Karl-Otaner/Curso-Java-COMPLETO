package fundamentos.capitulosBasicos;

public class areaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.141516;

        double area =  PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * area * area;
        System.out.println("Área = " + area + "m2.'");



    }

}
