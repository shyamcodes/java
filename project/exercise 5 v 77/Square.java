package com.codewithrahul.Shape;

public class Square extends Shape {
    Square(int dim1) {
        super(dim1, -1);
    }

    public double area() {
        return this.dim1 * this.dim1;
    }
}