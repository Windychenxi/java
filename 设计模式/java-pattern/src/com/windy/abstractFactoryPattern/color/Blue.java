package com.windy.abstractFactoryPattern.color;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:40
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
