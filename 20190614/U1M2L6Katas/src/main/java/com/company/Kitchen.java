package com.company;

public class Kitchen extends Home {

    private String flooring;
    private boolean lighting;


    // Getters and Setters
    public String getFlooring() {
        return flooring;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    public boolean isLighting() {
        return lighting;
    }

    public void setLighting(boolean lighting) {
        this.lighting = lighting;
    }

    // Default
    public Kitchen() {

    }

    public void isPowered(boolean lighting) {

    }

    public void calcSqrFt(int length, int width) {

    }
}
