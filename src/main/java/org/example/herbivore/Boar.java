package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Boar extends Herbivore implements DefaultAction {
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


}
