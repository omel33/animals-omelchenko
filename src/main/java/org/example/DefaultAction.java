package org.example;

import location.Island;
import location.Location;

public interface DefaultAction extends Action {
     Logger dLogger = Logger.getInstance();
     void eat(Location location) ;

    @Override
    default void move(Island island, Animal animal, int currentX, int currentY, int maxMoveCount) {
        int newX = currentX + (int) (Math.random() * 3) - 1;
        int newY = currentY + (int) (Math.random() * 3) - 1;
        if (newX >= 0 && newX < island.getWidth() && newY >= 0 && newY < island.getHeight()) {
            Location newLocation = island.getLocation(newX, newY);
            if (newLocation.getAnimals().size() < maxMoveCount) {
                island.getLocation(currentX, currentY).removeAnimal(animal);
                newLocation.addAnimal(animal);
                Logger.getInstance().logMessage(animal.getClass().getSimpleName() + " moved from (" + currentX + ", " + currentY + ") to (" + newX + ", " + newY + ")");
            }
        }
    }

    @Override
    default boolean reproduce(Location location, Animal animalToAdd, int maxAnimalCount) {
        long count = location.getAnimals().stream()
                .filter(animal -> animal.getClass().equals(animalToAdd.getClass()))
                .count();
        boolean canReproduce = count > 1 && location.getAnimals().size() < maxAnimalCount;
        if (canReproduce) {
            location.addAnimal(animalToAdd);
            Logger.getInstance().logMessage(animalToAdd.getClass().getSimpleName() + " reproduced at location");
        }
        return canReproduce;
    }

}
