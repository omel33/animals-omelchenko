package org.example.herbivore;

public class Duck extends Herbivore{
    public Duck(){
        super(1,200,4,0.15);
    }
    @Override
    public void eat() {
        System.out.println("Duck is eat");
    }

    @Override
    public void move() {
        System.out.println("Duck is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Duck is reproduce");

    }
}
