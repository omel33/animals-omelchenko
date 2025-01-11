package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.Animal;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivore extends Animal {
    public Herbivore(double weight, int maxCount, int speed, double foodNeed) {
        super(weight, maxCount, speed, foodNeed);
    }


    public abstract void eat(Location location);

    @Override
    public void move(Island island, int currentX, int currentY) {

    }


    @Override
    public void reproduce(Location location) {

    }

    protected boolean tryToEat(Animal prey, double probability) {
        return ThreadLocalRandom.current().nextDouble() < probability;
    }
}