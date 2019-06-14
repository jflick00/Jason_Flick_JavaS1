package com.company.abstractapproach;

public class Circle extends Shape{

    protected double radius;

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement Methods
    public double area() {
        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public double perimeter() {
        double circlePerimeter = 2 * Math.PI * radius;
        return circlePerimeter;
    }
}