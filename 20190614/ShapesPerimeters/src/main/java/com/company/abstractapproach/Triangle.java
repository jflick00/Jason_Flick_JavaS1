package com.company.abstractapproach;

public class Triangle extends Shape{

    protected double base;
    protected double height;
    protected double side3;
    protected double side2;

    // Getters and Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    //Implement Methods
    public double area() {
        double triangleArea = ((base * height) / 2);
        return triangleArea;
    }

    public double perimeter() {
        double trianglePerimeter = (base + side2 + side3);
        return trianglePerimeter;
    }
}
