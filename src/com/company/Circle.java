package com.company;

public class Circle extends Shape{

    Circle(int rad) {
        this.radius=rad;
        System.out.println("Circle created.");
    }

    @Override
    public void draw() {
        System.out.println("Circle area: " + radius*3.14);
    }

    private int radius;
}
