package com.windy.abstractFactoryPattern.shape;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:37
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
