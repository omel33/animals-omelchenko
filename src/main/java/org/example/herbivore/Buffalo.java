package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.DefaultAction;
import org.example.carnivore.Bear;

public class Buffalo extends Herbivore implements DefaultAction {
    public Buffalo() {
        super(700, 10, 3, 100);
    }

    @Override
    public void eat(Location location) {
        if (location.getPlants().getQuantity() > 0) {
            location.getPlants().setQuantity(location.getPlants().getQuantity() - 100);
            System.out.println("Buffalo is plants");
        }

    }

}
