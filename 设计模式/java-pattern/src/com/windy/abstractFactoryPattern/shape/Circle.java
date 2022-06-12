package com.windy.abstractFactoryPattern.shape;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:38
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}