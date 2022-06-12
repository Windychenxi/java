package com.windy.abstractFactoryPattern.color;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:39
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
