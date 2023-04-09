package edu.uqu.cs;

public class Garage {

    private Car[] cars = new Car[3];
    public static int countCars = 0;

    public Garage() {
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }
    }

    public void addCar(String model) {
        if (countCars < cars.length) {
            cars[countCars].setModel(model);
            cars[countCars].moveCarIn();
            countCars++;
        }
    }

    public void moveOut(String model) {
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                car.moveCarOut();
                break;
            }
        }
    }

    public void moveIn(String model) {
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                car.moveCarIn();
                break;
            }
        }
    }

    public void listCars() {
        for (Car car : cars) {
            if (car.getInOutGarage()) {
                System.out.println(car.getModel());
            }
        }
    }
}