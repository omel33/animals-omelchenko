package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Caterpillar extends Herbivore implements DefaultAction {
    public Caterpillar(){
        super(0.01,1000,0,0);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-1);
            logger.logMessage("Caterpillar eat is plants");
        }

    }


}
