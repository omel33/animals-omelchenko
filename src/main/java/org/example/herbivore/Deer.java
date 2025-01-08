package org.example.herbivore;

import location.Island;
import location.Location;

public class Deer extends Herbivore{
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

    @Override
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island,currentX,currentY);
        System.out.println("Deer is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Deer is reproduce");

    }
}
