package org.example.carnivore;

public class Boa extends Carnivore{
    public Boa(){
        super(15,30,1,3);
    }
    @Override
    public void eat() {
        System.out.println("Boa is hunting and eat");
    }

    @Override
    public void move() {
        System.out.println("Boa is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Boa is reproduce");

    }
}
