package org.example.herbivore;

public class Buffalo extends Herbivore {
    public Buffalo(){
        super(700,10,3,100);
    }
    @Override
    public void eat() {
        System.out.println("Buffalo is eat");
    }

    @Override
    public void move() {
        System.out.println("Buffalo is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Buffalo is reproduce");

    }
}
