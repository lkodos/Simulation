package ru.lkodos;

import ru.lkodos.entity.*;

import java.util.HashMap;
import java.util.Random;

public class Field {

    private final int size = 10;
    private final int grassCount = 10;
    private final int herbiroveCount = 3;
    private final int predatorCount = 3;
    private final int treeCount = 5;

    HashMap<Coordinates, Entity> entities = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        entities.put(coordinates, entity);
    }

    public void setStartEntityPositions() {
        Random random = new Random();
        Coordinates coordinates;
        // grass
        for (int i = 0; i < grassCount; i++) {
            do {
                coordinates = new Coordinates(random.nextInt(size) + 1, random.nextInt(size) + 1);
            } while (entities.containsKey(coordinates));

            setEntity(coordinates, new Grass(coordinates));
        }
        // herbirove
        for (int i = 0; i < herbiroveCount; i++) {
            do {
                coordinates = new Coordinates(random.nextInt(size) + 1, random.nextInt(size) + 1);
            } while (entities.containsKey(coordinates));

            setEntity(coordinates, new Herbirove(coordinates));
        }
        // predator
        for (int i = 0; i < predatorCount; i++) {
            do {
                coordinates = new Coordinates(random.nextInt(size) + 1, random.nextInt(size) + 1);
            } while (entities.containsKey(coordinates));

            setEntity(coordinates, new Predator(coordinates));
        }
        // trees
        for (int i = 0; i < treeCount; i++) {
            do {
                coordinates = new Coordinates(random.nextInt(size) + 1, random.nextInt(size) + 1);
            } while (entities.containsKey(coordinates));

            setEntity(coordinates, new Tree(coordinates));
        }
    }

    public boolean isSquareEmpty(Coordinates coordinates) {
        return !entities.containsKey(coordinates);
    }

    public int getSize() {
        return size;
    }

    public Entity getEntity(Coordinates coordinates) {
        return entities.get(coordinates);
    }
}
