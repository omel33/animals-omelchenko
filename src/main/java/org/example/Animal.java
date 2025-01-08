package org.example;

import location.Island;
import location.Location;

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

    protected void moveRandomly(Island island,int currentX,int currentY){
        int newX=currentX+(int)(Math.random()*3)-1;
        int newY=currentY+(int)(Math.random()*3)-1;
        if(newX>=0&&newX<island.getWidth()&&newY>=0&&newY<island.getHeight()){
            Location newLocation=island.getLocation(newX,newY);
            if(newLocation.getAnimals().size()<maxCount){
                island.getLocation(currentX,currentY).removeAnimal(this);
                newLocation.addAnimal(this);
                System.out.println(this.getClass().getSimpleName()+"Move to new location");
            }
        }
    }
}
