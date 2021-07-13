package com.company;

public class Vehicle {

    private int length;
    private int numberOfSeats;
    private int numberOfTears;
    private String brand;
    private int currentSpeed;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfTears() {
        return numberOfTears;
    }

    public void setNumberOfTears(int numberOfTears) {
        this.numberOfTears = numberOfTears;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int speedUp() {
        return currentSpeed + 5;
    }

    public int slowDown() {
        return currentSpeed - 5;
    }

    public void startEngine() {
        System.out.println("Engine is ON");
    }

    public void stopEngine() {
        System.out.println("Engine is OFF");
        currentSpeed = 0;
    }
}
