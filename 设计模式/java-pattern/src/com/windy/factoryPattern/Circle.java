package com.windy.factoryPattern;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 21:33
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
