package org.example.herbivore;

import location.Island;
import location.Location;
import org.example.Animal;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivore extends Animal {
    public Herbivore(double weight, int maxCount, int speed, double foodNeed) {
        super(weight, maxCount, speed, foodNeed);
    }




    protected boolean tryToEat(Animal prey, double probability) {
        return ThreadLocalRandom.current().nextDouble() < probability;
    }
}