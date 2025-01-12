package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Horse extends Herbivore implements DefaultAction {
    public Horse(){
        super(400,20,4,60);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-60);
            System.out.println("Horse is plants");
        }

    }

}
