package org.example;

import location.Island;
import location.Location;
import org.example.carnivore.*;
import org.example.herbivore.*;

import java.util.concurrent.*;

public class SimulationManager {
    private Island island;
    private Config config;
    private ScheduledExecutorService scheduler;
    private ExecutorService animalExecutor;

    public SimulationManager(Config config) {
        this.config = config;
        this.island = new Island(config.getIslandWidth(), config.getIslandHeight());
        scheduler = Executors.newScheduledThreadPool(1);
        animalExecutor = Executors.newFixedThreadPool(10); // Наприклад, 10 потоків для тварин
        initializeAnimals();
    }

    private void initializeAnimals() {
        addAnimals(config.getInitialWolfCount(), () -> new Wolf());
        addAnimals(config.getInitialFoxCount(), () -> new Fox());
        addAnimals(config.getInitialBearCount(), () -> new Bear());
        addAnimals(config.getInitialBoaCount(), () -> new Boa());
        addAnimals(config.getInitialEagleCount(), () -> new Eagle());
        addAnimals(config.getInitialRabbitCount(), () -> new Rabbit());
        addAnimals(config.getInitialMouseCount(), () -> new Mouse());
        addAnimals(config.getInitialBoarCount(), () -> new Boar());
        addAnimals(config.getInitialDeerCount(), () -> new Deer());
        addAnimals(config.getInitialHorseCount(), () -> new Horse());
        addAnimals(config.getInitialGoatCount(), () -> new Goat());
        addAnimals(config.getInitialSheepCount(), () -> new Sheep());
        addAnimals(config.getInitialBuffaloCount(), () -> new Buffalo());
        addAnimals(config.getInitialDuckCount(), () -> new Duck());
        addAnimals(config.getInitialCaterpillarCount(), () -> new Caterpillar());
    }

    private void addAnimals(int count, AnimalCreator creator) {
        for (int i = 0; i < count; i++) {
            int x = (int) (Math.random() * config.getIslandWidth());
            int y = (int) (Math.random() * config.getIslandHeight());
            Location location = island.getLocation(x, y);
            if (location != null) {
                location.addAnimal(creator.create());
            }
        }
    }

    public void start() {
        scheduler.scheduleAtFixedRate(this::runSimulation, 0, config.getSimulationStepDuration(), TimeUnit.MILLISECONDS);
    }

    public void stop() {
        scheduler.shutdown();
        animalExecutor.shutdown();
    }

    private void runSimulation() {
        island.update();
        for (int i = 0; i < island.getWidth(); i++) {
            for (int j = 0; j < island.getHeight(); j++) {
                Location location = island.getLocation(i, j);
                for (Animal animal : location.getAnimals()) {
                    int finalI = i;
                    int finalJ = j;
                    animalExecutor.submit(() -> {
                        animal.eat(location);
                        animal.move(island, animal, finalI, finalJ, animal.getMaxCount());
                        animal.reproduce(location, animal, animal.getMaxCount());
                    });
                }
            }
        }

        System.out.println("Simulation step completed.");
    }
}
