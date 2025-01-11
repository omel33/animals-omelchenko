package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.carnivore.Bear;

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
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island,currentX,currentY);
        System.out.println("Rabbit is move");

    }

    @Override
    public void reproduce(Location location) {
        if (canReproduce(location)) {
            location.addAnimal(new Rabbit());
            System.out.println("Rabbit is reproduce");
        }


    }
}
