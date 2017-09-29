/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism4;

/**
 *
 * @author client
 */
public class Triangle extends Shape{
    private int base;
    private int height;
    
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5*base*height;
    }
    
}
