package plant;

import org.example.Logger;

public class Plant {
    private Logger logger = Logger.getInstance();
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
        logger.logMessage("Plants have grown. Current quantity: "+quantity);
    }

}
