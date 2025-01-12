package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Sheep extends Herbivore implements DefaultAction {
    public Sheep(){
        super(70,140,3,15);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-15);
            System.out.println("Sheep is plants");
        }

    }


}

