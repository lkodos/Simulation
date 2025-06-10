package ru.lkodos.entity;

import ru.lkodos.Field;

public class FieldRenderer {

    private final String GRASS_SPRITE = "\uD83E\uDD55";
    private final String HERBIROVE_SPRITE = "\uD83D\uDC30";
    private final String PREDATOR_SPRITE = "\uD83E\uDD81";
    private final String TREE_SPRITE = "\uD83C\uDF32";

    public void render(Field field) {
        for (int j = 1; j < field.getSize() + 1; j++) {
            for (int i = 1; i < field.getSize() + 1; i++) {
                Coordinates coordinates = new Coordinates(i, j);
                if (field.isSquareEmpty(coordinates)) {
                    System.out.print(" . ");
                } else {
                    System.out.print(getSprite(field.getEntity(coordinates)));
                }
            }
            System.out.println();
        }
    }

    public String getSprite(Entity entity) {
        if (entity instanceof Grass) {
            return GRASS_SPRITE;
        }
        else if (entity instanceof Herbirove) {
            return HERBIROVE_SPRITE;
        }
        else if (entity instanceof Predator) {
            return PREDATOR_SPRITE;
        }
        else if (entity instanceof Tree) {
            return TREE_SPRITE;
        }

        return "E";
    }

}
