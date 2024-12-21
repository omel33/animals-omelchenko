package org.example;

import location.Island;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimulationManager {
    private Island island;
    private ScheduledExecutorService scheduler;
    public SimulationManager(int width, int heigth){
        island=new Island(width,heigth);
        scheduler= Executors.newScheduledThreadPool(1);
    }
    public void start(){
        scheduler.scheduleAtFixedRate(this::runSimulation,0,1, TimeUnit.SECONDS);
    }
    private void runSimulation(){
        island.update();
        System.out.println("Simulation step completed.");
    }
}
