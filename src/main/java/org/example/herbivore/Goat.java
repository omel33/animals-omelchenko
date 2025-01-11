package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.carnivore.Bear;

public class Goat extends Herbivore{
    public Goat (){
        super(60,140,3,10);
    }
    @Override
    public void eat(Location location) {
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-10);
            System.out.println("Goat is plants");
        }

    }

    @Override
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island,currentX,currentY);
        System.out.println("Goat is move");

    }

    @Override
    public void reproduce(Location location) {
        if (canReproduce(location)) {
            location.addAnimal(new Goat());
            System.out.println("Goat is reproduce");
        }


    }
}
