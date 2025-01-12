package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Deer extends Herbivore implements DefaultAction {
    public Deer(){
        super(300,20,4,50);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-50);
            System.out.println("Deer is plants");
        }

    }


}
