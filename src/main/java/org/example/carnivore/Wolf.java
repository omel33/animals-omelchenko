package org.example.carnivore;

public class Wolf extends Carnivore {
    public Wolf() {
        super(50, 30, 3, 8);
    }

    @Override
    public void eat() {
        System.out.println("Wolf is hunting and eat");
    }

    @Override
    public void move() {
        System.out.println("Wolf is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Wolf is reproduce");

    }
}
