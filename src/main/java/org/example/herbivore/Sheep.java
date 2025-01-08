package org.example.herbivore;

import location.Island;
import location.Location;

public class Sheep extends Herbivore{
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

    @Override
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island,currentX,currentY);
        System.out.println("Sheep is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Sheep is reproduce");

    }
}

