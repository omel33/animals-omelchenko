package org.example.herbivore;

import location.Location;

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
    public void move() {
        System.out.println("Horse is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Horse is reproduce");

    }
}
