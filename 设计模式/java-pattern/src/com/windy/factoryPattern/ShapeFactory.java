package com.windy.factoryPattern;

import javax.lang.model.type.UnknownTypeException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 21:34
 */
public class ShapeFactory {

    // 使用 getShape 方法获取形状类型的对象
    public static Shape getShape(ShapeType shapeType) {

        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new RectAngle();
            case SQUARE:
                return new Square();
            default:
                throw new UnknownTypeException(shapeType, ShapeFactory.class);
        }
    }
}
