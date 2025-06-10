package ru.lkodos;

import ru.lkodos.entity.FieldRenderer;

public class Simulation {

    public void run() {
        FieldRenderer renderer = new FieldRenderer();
        Field field = new Field();
        field.setStartEntityPositions();

        renderer.render(field);
    }
}
