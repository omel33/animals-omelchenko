package org.example.herbivore;

public class Rabbit extends Herbivore{
    public Rabbit(){
        super(2,150,2,0.45);
    }
    @Override
    public void eat() {
        System.out.println("Rabbit is eat");
    }

    @Override
    public void move() {
        System.out.println("Rabbit is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Rabbit is reproduce");

    }
}
