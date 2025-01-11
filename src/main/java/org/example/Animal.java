package org.example;

import location.Island;
import location.Location;

public abstract class Animal  {
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
}
