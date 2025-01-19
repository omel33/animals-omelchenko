package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Goat extends Herbivore implements DefaultAction {
    public Goat (){
        super(60,140,3,10);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-10);
            logger.logMessage("Goat eat is plants");
        }

    }

}
