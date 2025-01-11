package org.example.carnivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.herbivore.*;

public class Eagle extends Carnivore implements DefaultAction {
    public Eagle(){
        super(6,20,3,1);
    }
    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> (animal instanceof Rabbit && tryToEat(animal, 0.9)) ||
                        (animal instanceof Mouse && tryToEat(animal, 0.9)) ||
                        (animal instanceof Duck && tryToEat(animal, 0.8)) ||
                        (animal instanceof Fox && tryToEat(animal, 0.1)))
                .findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Wolf ate a " + animal.getClass()
                            .getSimpleName().toLowerCase() + ".");
                });

    }

}
