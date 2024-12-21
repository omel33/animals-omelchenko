package org.example.herbivore;

import org.example.carnivore.Bear;

public class Boar extends Herbivore{
    public Boar(){
        super(400,50,2,50);
    }
    @Override
    public void eat() {
        System.out.println("Boar is eat");
    }

    @Override
    public void move() {
        System.out.println("Boar is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Boar is reproduce");

    }
}
