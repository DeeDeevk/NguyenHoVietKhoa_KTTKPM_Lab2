package org.example;

import entity.Logistics;
import entity.RoadLogistics;
import entity.SeaLogistics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logistics roadLog = new RoadLogistics();
        roadLog.planDelivery();

        Logistics seaLog = new SeaLogistics();
        seaLog.planDelivery();
    }
}