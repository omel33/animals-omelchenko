package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Rabbit extends Herbivore implements DefaultAction {
    public Rabbit(){
        super(2,150,2,0.45);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-1);
            logger.logMessage("Rabbit eat is plants");
        }

    }


}
