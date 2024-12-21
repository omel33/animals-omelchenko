package org.example.carnivore;

public class Bear extends Carnivore{
    public Bear(){
        super(500,5,2,80);

    }
    @Override
    public void eat() {
        System.out.println("Bear is hunting and eat");
    }

    @Override
    public void move() {
        System.out.println("Bear is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Bear is reproduce");

    }
}
