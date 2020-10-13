package com.company;

import com.company.Shape;

public class Square extends Shape{

    public Square(int l, int w) {
        this.length = l;
        this.width = w;
        System.out.println("Square created.");
    }

    public int getLength() { return length; }

    public void setLength(int length) {
        this.length = length;
        System.out.println("Setting length to " + length);
    }

    public int getWidth() { return width; }

    public void setWidth(int width) {
        this.width = width;
        System.out.println("Setting width to " + width);
    }

    @Override
    public void draw() {
        System.out.println("Square area: " + length*width);
    }

    //test update

    private int length;
    private int width;
}
