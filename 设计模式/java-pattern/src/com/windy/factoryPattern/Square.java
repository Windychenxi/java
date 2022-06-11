package com.windy.factoryPattern;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 21:32
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside square::draw() method.");
    }
}
