package org.example.carnivore;

import location.Location;
import org.example.Animal;
import org.example.herbivore.*;

public class Wolf extends Carnivore {
    public Wolf() {
        super(50, 30, 3, 8);
    }

    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> (animal instanceof Rabbit && tryToEat(animal, 0.6)) ||
                        (animal instanceof Mouse && tryToEat(animal, 0.8)) ||
                        (animal instanceof Boar && tryToEat(animal, 0.15)) ||
                        (animal instanceof Buffalo && tryToEat(animal, 0.1)) ||
                        (animal instanceof Deer && tryToEat(animal, 0.15)) ||
                        (animal instanceof Duck && tryToEat(animal, 0.4)) ||
                        (animal instanceof Goat && tryToEat(animal, 0.6)) ||
                        (animal instanceof Horse && tryToEat(animal, 0.1)) ||
                        (animal instanceof Sheep && tryToEat(animal, 0.7)))
                .findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Wolf ate a " + animal.getClass()
                            .getSimpleName().toLowerCase() + ".");
                });

    }

    @Override
    public void move() {
        System.out.println("Wolf is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Wolf is reproduce");

    }
}
