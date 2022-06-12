package com.windy.abstractFactoryPattern;

import com.windy.abstractFactoryPattern.color.Color;
import com.windy.abstractFactoryPattern.color.ColorType;
import com.windy.abstractFactoryPattern.shape.Shape;
import com.windy.factoryPattern.ShapeType;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 22:42
 */
public abstract class AbstractFactory {
    public abstract Color getColor(ColorType colorType);
    public abstract Shape getShape(ShapeType shapeType);
}
