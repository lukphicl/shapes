package com.company;

public class Drawer {

    public Drawer(Shape shape) {this.shape = shape;}

    public void draw() {this.shape.draw();}

    private Shape shape;
}
