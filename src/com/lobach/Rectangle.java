package com.lobach;

public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double i = length * width;
        return i;
    }

    public double getPerimeter() {
        double i = (length + width) * 2;
        return i;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
