package org.example.herbivore;

public class Goat extends Herbivore{
    public Goat (){
        super(60,140,3,10);
    }
    @Override
    public void eat() {
        System.out.println("Goat is eat");
    }

    @Override
    public void move() {
        System.out.println("Goat is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Goat is reproduce");

    }
}
