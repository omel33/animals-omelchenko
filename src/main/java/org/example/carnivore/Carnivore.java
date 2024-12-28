package org.example.carnivore;

import location.Location;
import org.example.Animal;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Carnivore extends Animal {
    public Carnivore(double weight, int maxCount, int speed, double foodNeed){
        super(weight, maxCount, speed, foodNeed);
    }
    @Override
    public void eat(){

    }

    public abstract void eat(Location location);

    @Override
    public void move(){

    }
    @Override
    public void reproduce(){

    }
protected boolean tryToEat(Animal prey, double probability){
        return ThreadLocalRandom.current().nextDouble()<probability;
}
}
