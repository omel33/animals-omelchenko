package org.example.carnivore;

public class Fox extends Carnivore{
    public Fox(){
        super(8,30,2,2);
    }
    @Override
    public void eat() {
        System.out.println("Fox is hunting and eat");
    }

    @Override
    public void move() {
        System.out.println("Fox is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Fox is reproduce");

    }
}
