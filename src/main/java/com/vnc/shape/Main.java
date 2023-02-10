package com.vnc.shape;

import com.vnc.shape.circle.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        System.out.println(circle);
        System.out.println( circle.getPerimeter());
    }
}
