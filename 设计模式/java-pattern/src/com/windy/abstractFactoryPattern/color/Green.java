package com.windy.abstractFactoryPattern.color;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:40
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}