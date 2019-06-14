package com.company.concreteapproach;

public class Square extends Shape {

    private double height;
    private double width;

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Implement Methods
    public double area(){
        double sqaureArea = height * width;
        return sqaureArea;
    }

    public double perimeter(){
        double squarePerimeter = ((height*2) + (width*2));
        return squarePerimeter;
    }
}