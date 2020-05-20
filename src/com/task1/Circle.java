package com.task1;

public class Circle implements Figure {

    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }


}
