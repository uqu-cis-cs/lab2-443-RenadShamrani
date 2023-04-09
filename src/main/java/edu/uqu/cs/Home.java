package edu.uqu.cs;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        Garage garage = new Garage();

        garage.addCar("Toyota Corolla Cross");
        garage.listCars();

        garage.addCar("Ford Fusion");
        garage.listCars();

        garage.moveOut("Ford Fusion");
        garage.listCars();
    }
}