package com.company;

public class ComputerMouse {
    private String manufacturer;
    private String model;
    private int xPosition;
    private int yPosition;
    private int[] lastClickLocation;

    public ComputerMouse(String manufacturer, String model, int xPosition, int yPosition, int[] lastClickLocation) {
        this.manufacturer = manufacturer;
        this. model = model;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.lastClickLocation = lastClickLocation;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int[] getLastClickedLocation() {
        return lastClickLocation;
    }

    public void setLastClickedLocation(int[] lastClickLocation) {
        this.lastClickLocation = lastClickLocation;
    }

    public void move(int deltaX, int deltaY) {

    }

    public void click() {

    }
}


