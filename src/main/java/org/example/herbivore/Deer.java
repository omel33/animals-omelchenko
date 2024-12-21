package org.example.herbivore;

public class Deer extends Herbivore{
    public Deer(){
        super(300,20,4,50);
    }
    @Override
    public void eat() {
        System.out.println("Deer is eat");
    }

    @Override
    public void move() {
        System.out.println("Deer is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Deer is reproduce");

    }
}
