package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Config config = ConfigLoader.loadConfig("config.yml");
            SimulationManager simulationManager = new SimulationManager(config);
            simulationManager.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}