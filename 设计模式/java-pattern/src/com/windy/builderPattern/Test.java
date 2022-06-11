package com.windy.builderPattern;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 21:01
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel", "samsung")
                .setDisplay("24 inches")
                .setKeyboard("Logitech")
                .setUsbCount(2)
                .build();
        System.out.println(computer.toString());
    }
}
