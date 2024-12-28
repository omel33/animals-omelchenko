package org.example.herbivore;

import location.Location;

public class Rabbit extends Herbivore{
    public Rabbit(){
        super(2,150,2,0.45);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-1);
            System.out.println("Rabbit is plants");
        }

    }

    @Override
    public void move() {
        System.out.println("Rabbit is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Rabbit is reproduce");

    }
}
