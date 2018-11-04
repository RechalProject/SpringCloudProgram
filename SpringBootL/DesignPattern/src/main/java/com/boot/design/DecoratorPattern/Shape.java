package com.boot.design.DecoratorPattern;

// 实现
// 我们将创建一个 Shape 接口和实现了 Shape 接口的实体类。然后我们创建一个实现了 Shape 接口的抽象装饰类 ShapeDecorator，
// 并把 Shape 对象作为它的实例变量。
//
// RedShapeDecorator 是实现了 ShapeDecorator 的实体类。
//
// DecoratorPatternDemo1，我们的演示类使用 RedShapeDecorator 来装饰 Shape 对象。
public interface Shape {
   void draw();
}