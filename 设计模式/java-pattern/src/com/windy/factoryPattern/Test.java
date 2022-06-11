package com.windy.factoryPattern;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 21:36
 */
public class Test {
    public static void main(String[] args) {
        // 创建工厂实例对象
        ShapeFactory shapeFactory = new ShapeFactory();

        // 通过不同的 shapeType 类型，来创建不同的对象
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
