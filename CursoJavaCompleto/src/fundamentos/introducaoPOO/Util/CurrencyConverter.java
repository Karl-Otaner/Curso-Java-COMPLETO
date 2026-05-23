package fundamentos.introducaoPOO.Util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double valorFinal(double cotacaoDolar, double quantidadeDolares){
        double valorSemIof = cotacaoDolar * quantidadeDolares;
        return valorSemIof + (valorSemIof * IOF);
    }
}
