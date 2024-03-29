package com.laok.dp.structural.decorator.old;

/**
 * @author k 2022/8/17 11:34
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
//        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
//        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border------------");
        redCircle.draw();

        System.out.println("\nRectangle of red border111111111");
        redRectangle.draw();
    }

}
