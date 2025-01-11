package org.example;

import location.Island;
import location.Location;

public interface Action {
    void eat(Location location);

     boolean reproduce(Location location,Animal animal,int maxAnimalCount);

    void move(Island island,Animal animal, int currentX, int currentY,int maxMoveCount);
}
