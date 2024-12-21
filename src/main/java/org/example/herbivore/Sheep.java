package org.example.herbivore;

public class Sheep extends Herbivore{
    public Sheep(){
        super(70,140,3,15);
    }
    @Override
    public void eat() {
        System.out.println("Sheep is eat");
    }

    @Override
    public void move() {
        System.out.println("Sheep is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Sheep is reproduce");

    }
}

