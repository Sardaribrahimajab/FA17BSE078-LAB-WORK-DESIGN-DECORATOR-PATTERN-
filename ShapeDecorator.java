package com.company;

public abstract class ShapeDecorator implements shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
