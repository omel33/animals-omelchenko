package org.example.herbivore;

public class Mouse extends Herbivore{
    public Mouse(){
        super(0.05,500,1,0.01);
    }
    @Override
    public void eat() {
        System.out.println("Mouse is eat");
    }

    @Override
    public void move() {
        System.out.println("Mouse is move");

    }

    @Override
    public void reproduce() {
        System.out.println("Mouse is reproduce");

    }
}
