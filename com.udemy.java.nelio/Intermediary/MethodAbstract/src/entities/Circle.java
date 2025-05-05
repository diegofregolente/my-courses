package entities;

import entities.enums.Color;

public class Circle extends Shape{

    public double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
