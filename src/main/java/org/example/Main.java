package org.example;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            Config config =new ConfigLoader().loadConfig("config.yml");
            SimulationManager simulationManager = new SimulationManager(config);
            simulationManager.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}