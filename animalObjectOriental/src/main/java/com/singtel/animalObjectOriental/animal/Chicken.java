package com.singtel.animalObjectOriental.animal;

public class Chicken extends Animal implements ISing {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
