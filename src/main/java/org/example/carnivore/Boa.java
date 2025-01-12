package org.example.carnivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.herbivore.*;

public class Boa extends Carnivore implements DefaultAction {
    public Boa() {
        super(15, 30, 1, 3);
    }

    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> (animal instanceof Rabbit && tryToEat(animal, 0.2)) ||
                        (animal instanceof Mouse && tryToEat(animal, 0.4)) ||
                        (animal instanceof Duck && tryToEat(animal, 0.1)) ||
                        animal instanceof Fox && tryToEat(animal, 0.15))
                .findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Wolf ate a " + animal.getClass()
                            .getSimpleName().toLowerCase() + ".");
                });

    }


}
