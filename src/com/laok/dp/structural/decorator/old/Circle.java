package com.laok.dp.structural.decorator.old;

/**
 * @author k 2022/8/17 11:27
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle : draw, 我是最初的类，我需要增强");
    }
}
