package location;

import org.example.Animal;
import plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private List<Animal> animals;
    private Plant plants;

    public Location(){
        this.animals=new ArrayList<>();
        this.plants=new Plant(1000);
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }
    public List<Animal> getAnimals(){
        return animals;

    }
    public Plant getPlants(){
        return plants;
    }
    public void update(){
        plants.grow();
    }
}
