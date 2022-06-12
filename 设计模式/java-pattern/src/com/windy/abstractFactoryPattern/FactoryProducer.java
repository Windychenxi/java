package com.windy.abstractFactoryPattern;

import com.windy.abstractFactoryPattern.color.ColorFactory;
import com.windy.abstractFactoryPattern.shape.ShapeFactory;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/12 9:18
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
