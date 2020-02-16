package com.singtel.animalObjectOriental.animal;

public class Butterfly extends CaterPillar implements IFly {
    @Override
    public void walk() {
        System.out.println("I'm butterfly and I'm walking");
    }

    @Override
    public void fly() {
        System.out.println("I'm butterfly and I'm flying");
    }
}
