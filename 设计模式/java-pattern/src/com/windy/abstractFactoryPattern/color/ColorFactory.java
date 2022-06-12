package com.windy.abstractFactoryPattern.color;

import com.windy.abstractFactoryPattern.AbstractFactory;
import com.windy.abstractFactoryPattern.shape.Circle;
import com.windy.abstractFactoryPattern.shape.Rectangle;
import com.windy.abstractFactoryPattern.shape.Shape;
import com.windy.abstractFactoryPattern.shape.Square;
import com.windy.factoryPattern.ShapeType;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:45
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType colorType) {
        switch (colorType) {
            case RED:
                return new  Red();
            case GREEN:
                return new Green();
            case BLUE:
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }
}
