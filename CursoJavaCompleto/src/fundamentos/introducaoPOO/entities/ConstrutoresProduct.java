package fundamentos.introducaoPOO.entities;

public class ConstrutoresProduct {
    public String name2;
    public double price2;
    public int quantity2;

    public ConstrutoresProduct(String name2, double price2, int quantity2){
        this.name2 = name2;
        this.price2 = price2;
        this.quantity2 = quantity2;
    }

    public double totalValueInStock(){
        return price2 * quantity2;
    }

    public void addProducts( int quantity2){
        this.quantity2 += quantity2;
    }

    public void removeProducts(int quantity2){
        this.quantity2 -=quantity2;
    }

    public String toString(){
        return name2
                + ", $ "
                + String.format("%.2f", price2)
                + ", "
                + quantity2
                + " units, Total: $ "
                + String.format("%.2f",totalValueInStock());
    }

}
