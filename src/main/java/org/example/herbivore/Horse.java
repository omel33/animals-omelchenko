package org.example.herbivore;

public class Horse extends Herbivore{
    public Horse(){
        super(400,20,4,60);
    }
    @Override
    public void eat() {
        System.out.println("Horse is eat");
    }

    @Override
    public void move() {
        System.out.println("Horse is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Horse is reproduce");

    }
}
