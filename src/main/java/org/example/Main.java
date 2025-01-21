package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Config config = new Config(
                20, // Ширина острова
                20, // Висота острова
                50,  // Початкова кількість вовків
                25,  // Початкова кількість лисиць
                20,  // Початкова кількість ведмедів
                50,  // Початкова кількість удавів
                30,  // Початкова кількість орлів
                70, // Початкова кількість кроликів
                230, // Початкова кількість мишей
                90, // Початкова кількість кабанів
                40, // Початкова кількість оленів
                30, // Початкова кількість коней
                70, // Початкова кількість кіз
                60, // Початкова кількість овець
                20, // Початкова кількість буйволів
                180, // Початкова кількість качок
                1000, // Початкова кількість гусениць
                10000 // Тривалість такту симуляції в мілісекундах
        );

        SimulationManager simulationManager = new SimulationManager(config);
        simulationManager.start();
    }
}