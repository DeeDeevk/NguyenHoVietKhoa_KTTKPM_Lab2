package org.example;

import FactoryPattern.Logistics;
import FactoryPattern.RoadLogistics;
import FactoryPattern.SeaLogistics;
import OrderManagement.OrderContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();

        System.out.println("Hiện tại: " + context.getStatus());

        context.apply();
        System.out.println("Hiện tại: " + context.getStatus());

        context.apply();
        System.out.println("Hiện tại: " + context.getStatus());

        context.apply();
    }
}