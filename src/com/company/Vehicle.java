package com.company;

public class Vehicle {

    private int lengthOfVehicle;
    private int numberOfSeats;
    private int numberOfTires;
    private String nameOfVehicle;
    private int currentSpeed;

    public int getLengthOfVehicle() {
        return lengthOfVehicle;
    }

    public void setLengthOfVehicle(int lengthOfVehicle) {
        this.lengthOfVehicle = lengthOfVehicle;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 5;
    }

    public void slowDown() {
        currentSpeed -= 5;
    }

    public void startEngine() {
        System.out.println("Engine is ON");
    }

    public void stopEngine() {
        System.out.println("Engine is OFF");
        currentSpeed = 0;
    }
}
