package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Duck extends Herbivore implements DefaultAction {
    public Duck() {
        super(1, 200, 4, 0.15);
    }

    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> animal instanceof Caterpillar && tryToEat(animal, 0.9)
                ).findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    logger.logMessage("Duck is eat caterpillar");
                });
        if (location.getPlants().getQuantity() > 0) {
            location.getPlants().setQuantity(location.getPlants().getQuantity() - 1);
            logger.logMessage("Duck eat is plants");
        }

    }
}