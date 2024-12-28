package org.example.herbivore;

import location.Location;

public class Caterpillar extends Herbivore{
    public Caterpillar(){
        super(0.01,1000,0,0);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-1);
            System.out.println("Caterpillar is plants");
        }

    }

    @Override
    public void move() {
        System.out.println("Caterpillar is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Caterpillar is reproduce");

    }
}
