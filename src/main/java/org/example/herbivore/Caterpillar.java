package org.example.herbivore;

public class Caterpillar extends Herbivore{
    public Caterpillar(){
        super(0.01,1000,0,0);
    }
    @Override
    public void eat() {
        System.out.println("Caterpillar is eat");
    }

    @Override
    public void move() {
        System.out.println("Caterpillar is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Caterpillar is reproduce");

    }
}
