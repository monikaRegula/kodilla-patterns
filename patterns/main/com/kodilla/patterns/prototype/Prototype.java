package com.kodilla.patterns.prototype;

public class Prototype<T> implements Cloneable {//interfejs oznaczający nie ma żadnej metody
    @Override
    public T clone() throws CloneNotSupportedException{
            return (T) super.clone();
    }
}
