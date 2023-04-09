package edu.uqu.cs;

public class Car {

    private String model;
    private boolean inOutGarage;

    public Car() {
        model = "";
        inOutGarage = false;
    }

    public String getModel() {
        return this.model;
    }

    public boolean getInOutGarage() {
        return this.inOutGarage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setInOutGarage(boolean inOutGarage) {
        this.inOutGarage = inOutGarage;
    }

    public void moveCarOut() {
        this.inOutGarage = false;
    }

    public void moveCarIn() {
        this.inOutGarage = true;
    }
}