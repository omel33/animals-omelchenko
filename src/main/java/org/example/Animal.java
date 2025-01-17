package org.example;

import location.Island;
import location.Location;

public abstract class Animal implements DefaultAction {
    protected double weight;
    protected int maxCount;
    protected int speed;
    protected double foodNeed;


    public Animal(double weight, int maxCount, int speed, double foodNeed) {
        this.weight = weight;
        this.maxCount = maxCount;
        this.speed = speed;
        this.foodNeed = foodNeed;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFoodNeed() {
        return foodNeed;
    }
}
