package org.example;

public abstract class Animal implements Action {
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
