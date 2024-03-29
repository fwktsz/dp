package com.laok.dp.creational.Prototype;

import com.laok.dp.creational.Prototype.framework.AbstractProduct;
import com.laok.dp.creational.Prototype.framework.Product;

import java.nio.charset.StandardCharsets;

/**
 * @author k 2022/8/25 22:50
 */
public class UnderlinePen extends AbstractProduct implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {

        int length = s.getBytes(StandardCharsets.UTF_8).length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }


}
