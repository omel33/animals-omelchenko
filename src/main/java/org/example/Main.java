package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Config config = new Config(
                100, // Ширина острова
                20, // Висота острова
                5,  // Початкова кількість вовків
                5,  // Початкова кількість лисиць
                5,  // Початкова кількість ведмедів
                5,  // Початкова кількість удавів
                5,  // Початкова кількість орлів
                20, // Початкова кількість кроликів
                20, // Початкова кількість мишей
                10, // Початкова кількість кабанів
                10, // Початкова кількість оленів
                10, // Початкова кількість коней
                10, // Початкова кількість кіз
                10, // Початкова кількість овець
                10, // Початкова кількість буйволів
                10, // Початкова кількість качок
                100, // Початкова кількість гусениць
                5000 // Тривалість такту симуляції в мілісекундах
        );

        SimulationManager simulationManager = new SimulationManager(config);
        simulationManager.start();
    }
}