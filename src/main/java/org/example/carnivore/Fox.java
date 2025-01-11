package org.example.carnivore;

import location.Island;
import location.Location;
import org.example.herbivore.*;

public class Fox extends Carnivore{
    public Fox(){
        super(8,30,2,2);
    }
    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> (animal instanceof Rabbit && tryToEat(animal, 0.7)) ||
                        (animal instanceof Mouse && tryToEat(animal, 0.9)) ||
                        animal instanceof Caterpillar && tryToEat(animal, 0.4))
                .findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Wolf ate a " + animal.getClass()
                            .getSimpleName().toLowerCase() + ".");
                });

    }

    @Override
    public void move(Island island, int currentX, int currentY) {
        moveRandomly(island,currentX,currentY);
        System.out.println("Fox is move");

    }

    @Override
    public void reproduce(Location location) {
        if (canReproduce(location)) {
            location.addAnimal(new Fox());
            System.out.println("Fox is reproduce");
        }


    }
}
