package com.laok.dp.structural.adapter.old;

public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adaptee没有的方法
     */
    public void sampleOperation2();
}