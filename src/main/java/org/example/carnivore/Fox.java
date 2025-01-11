package org.example.carnivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.herbivore.*;

public class Fox extends Carnivore implements DefaultAction {
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
}
