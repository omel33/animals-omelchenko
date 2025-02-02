package org.example.carnivore;

import location.Island;
import location.Location;
import org.example.herbivore.*;

public class Bear extends Carnivore{
    public Bear(){
        super(500,5,2,80);

    }
    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> (animal instanceof Rabbit && tryToEat(animal, 0.8)) ||
                        (animal instanceof Mouse && tryToEat(animal, 0.9)) ||
                        (animal instanceof Boar && tryToEat(animal, 0.50)) ||
                        (animal instanceof Buffalo && tryToEat(animal, 0.2)) ||
                        (animal instanceof Deer && tryToEat(animal, 0.8)) ||
                        (animal instanceof Duck && tryToEat(animal, 0.1)) ||
                        (animal instanceof Goat && tryToEat(animal, 0.7)) ||
                        (animal instanceof Horse && tryToEat(animal, 0.4)) ||
                        (animal instanceof Sheep && tryToEat(animal, 0.7))||
                        animal instanceof Boa && tryToEat(animal, 0.8))
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
        System.out.println("Bear is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Bear is reproduce");

    }
}
