package com.company;

public class Shapes {

    public static void main(String[] args) {
	// write your code here
        System.out.println("AAAAAAAAAH");

        Circle mCircle = new Circle(5);
        Square mSquare = new Square(5,6);
        Drawer mDrawer = new Drawer(mCircle);
        // BLEEEEEEEH
        Drawer sDrawer = new Drawer(mSquare);

        mDrawer.draw();
        sDrawer.draw();
    }
}
