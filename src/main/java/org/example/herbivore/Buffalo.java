package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.carnivore.Bear;

public class Buffalo extends Herbivore {
    public Buffalo() {
        super(700, 10, 3, 100);
    }

    @Override
    public void eat(Location location) {
        if (location.getPlants().getQuantity() > 0) {
            location.getPlants().setQuantity(location.getPlants().getQuantity() - 100);
            System.out.println("Buffalo is plants");
        }

    }

    @Override
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island, currentX, currentY);
        System.out.println("Buffalo is move");

    }

    @Override
    public void reproduce(Location location) {
        if (canReproduce(location)) {
            location.addAnimal(new Buffalo());
            System.out.println("Buffalo is reproduce");
        }


    }
}
