package com.singtel.animalObjectOriental.animal;

public class Cat extends Animal implements ISing{

    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
