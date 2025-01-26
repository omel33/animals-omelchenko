package location;

import org.example.Animal;
import org.example.Logger;
import plant.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Location {
    private List<Animal> animals;
    private Plant plants;
    protected Logger logger = Logger.getInstance();

    public Location() {
        this.animals = new ArrayList<>();
        this.plants = new Plant(1000);
    }

    public synchronized void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public synchronized void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public synchronized List<Animal> getAnimals() {
        return animals;

    }

    public Plant getPlants() {
        return plants;
    }

    public void update() {
        plants.grow();
    }

    public void logLocationDetails(int x, int y) {
        Logger logger = Logger.getInstance();
        StringBuilder details = new StringBuilder("Location (" + x + ", " + y + "): ");
        details.append("Plants: ").append(plants.getQuantity()).append("; ");
        details.append("Animals: ");

        if (animals.isEmpty()) {
            details.append("None");
        } else {
            animals.stream()
                    .collect(Collectors.groupingBy(Animal::getClass, Collectors.counting()))
                    .forEach((animalClass, count) -> {
                        details.append(animalClass.getSimpleName()).append(" x").append(count).append(", ");
                    });
            details.setLength(details.length() - 2); // Видалення останньої коми
        }

        logger.logMessage(details.toString());
    }
    public String getAnimalSummary() {
        if (animals.isEmpty()) {
            return "No animals";
        }

        return animals.stream()
                .collect(Collectors.groupingBy(Animal::getClass, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> entry.getKey().getSimpleName() + " (" + entry.getValue() + ")")
                .collect(Collectors.joining(", "));
    }


}
