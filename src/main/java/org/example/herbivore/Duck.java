package org.example.herbivore;

import location.Location;

public class Duck extends Herbivore{
    public Duck(){
        super(1,200,4,0.15);
    }
    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> animal instanceof Caterpillar && tryToEat(animal, 0.9)
                ).findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Duck is eat caterpillar");
                });
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-1);
            System.out.println("Duck is plants");
        }

    }

    @Override
    public void move() {
        System.out.println("Duck is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Duck is reproduce");

    }
}
