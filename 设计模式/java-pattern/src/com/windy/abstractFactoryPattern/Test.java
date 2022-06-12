package com.windy.abstractFactoryPattern;

import com.windy.abstractFactoryPattern.color.Color;
import com.windy.abstractFactoryPattern.color.ColorType;
import com.windy.abstractFactoryPattern.shape.Shape;
import com.windy.factoryPattern.ShapeType;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/12 9:20
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
        Color red = colorFactory.getColor(ColorType.RED);
        red.fill();
    }
}
