package org.example.herbivore;

import location.Location;

public class Buffalo extends Herbivore {
    public Buffalo(){
        super(700,10,3,100);
    }

    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-100);
            System.out.println("Buffalo is plants");
        }

    }

    @Override
    public void move() {
        System.out.println("Buffalo is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Buffalo is reproduce");

    }
}
