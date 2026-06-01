package fundamentos.introducaoPOO.entities;

public class SobrecargaProduct {
    public String name3;
    public double price3;
    public int quantity3;

    public SobrecargaProduct(){

    }
    public SobrecargaProduct(String name3, double price3, int quantity3){
        this.name3 = name3;
        this.price3 = price3;
        this.quantity3 = quantity3;
    }

    public SobrecargaProduct(String name3, double price3){
        this.name3 = name3;
        this.price3 = price3;
    }

    public double totalValueInStock(){
        return price3 * quantity3;
    }

    public void addProducts( int quantity2){
        this.quantity3 += quantity2;
    }

    public void removeProducts(int quantity2){
        this.quantity3 -=quantity2;
    }

    public String toString(){
        return name3
                + ", $ "
                + String.format("%.2f", price3)
                + ", "
                + quantity3
                + " units, Total: $ "
                + String.format("%.2f",totalValueInStock());
    }

}
