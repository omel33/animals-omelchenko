package org.example.carnivore;

public class Eagle extends Carnivore{
    public Eagle(){
        super(6,20,3,1);
    }
    @Override
    public void eat() {
        System.out.println("Eagle is hunting and eat");
    }

    @Override
    public void move() {
        System.out.println("Eagle is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Eagle is reproduce");

    }
}
