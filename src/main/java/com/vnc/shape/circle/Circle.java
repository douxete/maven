package com.vnc.shape.circle;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getPerimeter(){
        return 2 * (3.14 * this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
