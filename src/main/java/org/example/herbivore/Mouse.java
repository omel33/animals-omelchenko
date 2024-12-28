package org.example.herbivore;

import location.Location;

public class Mouse extends Herbivore{
    public Mouse(){
        super(0.05,500,1,0.01);
    }
    @Override
    public void eat(Location location) {
        location.getAnimals().stream()
                .filter(animal -> animal instanceof Caterpillar && tryToEat(animal, 0.9)
                ).findFirst()
                .ifPresent(animal -> {
                    location.removeAnimal(animal);
                    System.out.println("Mouse is eat caterpillar");
                });
        if(location.getPlants().getQuantity()>0){
            location.getPlants().setQuantity(location.getPlants().getQuantity()-1);
            System.out.println("Boar is plants");
        }

    }

    @Override
    public void move() {
        System.out.println("Mouse is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Mouse is reproduce");

    }
}
