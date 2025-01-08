package org.example;

import location.Island;

public interface Action {
    void eat();

    void reproduce();

    void move(Island island, int currentX, int currentY);
}
