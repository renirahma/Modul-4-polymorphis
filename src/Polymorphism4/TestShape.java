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
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red",4,5);
        System.out.println(s1);
        System.out.println("Area is "+s1.getArea());
        
        Shape s2 = new Triangle("blue",4,5);
        System.out.println(s2);
        System.out.println("Area is "+s2.getArea());
    }
}
