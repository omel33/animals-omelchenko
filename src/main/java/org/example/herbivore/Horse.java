package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.carnivore.Bear;

public class Horse extends Herbivore{
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

    @Override
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island,currentX,currentY);
        System.out.println("Horse is move");

    }

    @Override
    public void reproduce(Location location) {
        if (canReproduce(location)) {
            location.addAnimal(new Horse());
            System.out.println("Horse is reproduce");
        }


    }
}
