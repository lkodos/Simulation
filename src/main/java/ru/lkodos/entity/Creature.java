package ru.lkodos.entity;

public abstract class Creature extends Entity {

    int speed;
    int hp;

    public Creature(Coordinates coordinates) {
        super(coordinates);
    }

    public void makeMove() {

    }
}
