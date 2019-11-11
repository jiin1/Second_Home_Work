package com.lobach;

public class Circle {
    private double radius=1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.color = "red";
    this.radius= 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }

    private double getArea(){
        double i= Math.PI*radius*radius;
        return i;
    }
}

