package plant;

public class Plant {
    private int quantity;
    public Plant(int initialQuantity){
        this.quantity=initialQuantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void grow(){
        quantity+=15;
        System.out.println("Plants have grown. Current quantity: "+quantity);
    }

}
