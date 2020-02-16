package com.singtel.animalObjectOriental.animal;

public class Bird extends Animal implements IFly, ISing {
    @Override
    public void fly() {
        System.out.println("I'm bird and I am flying");
    }

    @Override
    public void sing() {
        System.out.println("I'm bird and I am singing");
    }
}
