package com.company;

import com.company.Shape;

public class Square extends Shape{

    public Square(int l, int w) {
        this.length = l;
        this.width = w;
        System.out.println("Square created.");
    }

    @Override
    public void draw() {
        System.out.println("Square area: " + length*width);
    }

    private int length;
    private int width;
}
