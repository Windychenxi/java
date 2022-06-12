package com.windy.abstractFactoryPattern.shape;

import com.windy.abstractFactoryPattern.AbstractFactory;
import com.windy.abstractFactoryPattern.color.Color;
import com.windy.abstractFactoryPattern.color.ColorType;
import com.windy.factoryPattern.ShapeType;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:48
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
