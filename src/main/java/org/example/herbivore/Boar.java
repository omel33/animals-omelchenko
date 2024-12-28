package org.example.herbivore;

import location.Location;

public class Boar extends Herbivore {
    public Boar() {
        super(400, 50, 2, 50);
    }

    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> animal instanceof Mouse && tryToEat(animal, 0.5)||
                        animal instanceof Caterpillar && tryToEat(animal, 0.9)
                ).findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Boar is eat mouse");
                });
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-50);
            System.out.println("Boar is plants");
        }

    }

    @Override
    public void move() {
        System.out.println("Boar is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Boar is reproduce");

    }
}
