package org.example.herbivore;

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
    public void move() {
        System.out.println("Sheep is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Sheep is reproduce");

    }
}

