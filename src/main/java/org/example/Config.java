package org.example;

public class Config {
    private int islandWidth;
    private int islandHeight;
    private int initialWolfCount;
    private int initialFoxCount;
    private int initialBearCount;
    private int initialBoaCount;
    private int initialEagleCount;
    private int initialBoarCount;
    private int initialBuffaloCount;
    private int initialCaterpillarCount;
    private int initialDeerCount;
    private int initialDuckCount;
    private int initialGoatCount;
    private int initialHorseCount;
    private int initialMouseCount;
    private int initialRabbitCount;
    private int initialSheepCount;
    private long simulationStepDuration;

    public Config(int islandWidth, int islandHeight, int initialWolfCount, int initialFoxCount,
                  int initialBearCount, int initialBoaCount, int initialEagleCount, int initialBoarCount,
                  int initialBuffaloCount, int initialCaterpillarCount, int initialDeerCount,
                  int initialDuckCount, int initialGoatCount, int initialHorseCount, int initialMouseCount,
                  int initialRabbitCount, int initialSheepCount, long simulationStepDuration) {
        this.islandWidth = islandWidth;
        this.islandHeight = islandHeight;
        this.initialWolfCount = initialWolfCount;
        this.initialFoxCount = initialFoxCount;
        this.initialBearCount = initialBearCount;
        this.initialBoaCount = initialBoaCount;
        this.initialEagleCount = initialEagleCount;
        this.initialBoarCount = initialBoarCount;
        this.initialBuffaloCount = initialBuffaloCount;
        this.initialCaterpillarCount = initialCaterpillarCount;
        this.initialDeerCount = initialDeerCount;
        this.initialDuckCount = initialDuckCount;
        this.initialGoatCount = initialGoatCount;
        this.initialHorseCount = initialHorseCount;
        this.initialMouseCount = initialMouseCount;
        this.initialRabbitCount = initialRabbitCount;
        this.initialSheepCount = initialSheepCount;
        this.simulationStepDuration = simulationStepDuration;
    }

    public int getIslandWidth() {
        return islandWidth;
    }

    public int getIslandHeight() {
        return islandHeight;
    }

    public int getInitialWolfCount() {
        return initialWolfCount;
    }

    public int getInitialFoxCount() {
        return initialFoxCount;
    }

    public int getInitialBearCount() {
        return initialBearCount;
    }

    public int getInitialBoaCount() {
        return initialBoaCount;
    }

    public int getInitialEagleCount() {
        return initialEagleCount;
    }

    public int getInitialBoarCount() {
        return initialBoarCount;
    }

    public int getInitialBuffaloCount() {
        return initialBuffaloCount;
    }

    public int getInitialCaterpillarCount() {
        return initialCaterpillarCount;
    }

    public int getInitialDeerCount() {
        return initialDeerCount;
    }

    public int getInitialDuckCount() {
        return initialDuckCount;
    }

    public int getInitialGoatCount() {
        return initialGoatCount;
    }

    public int getInitialHorseCount() {
        return initialHorseCount;
    }

    public int getInitialMouseCount() {
        return initialMouseCount;
    }

    public int getInitialRabbitCount() {
        return initialRabbitCount;
    }

    public int getInitialSheepCount() {
        return initialSheepCount;
    }

    public long getSimulationStepDuration() {
        return simulationStepDuration;
    }
}
