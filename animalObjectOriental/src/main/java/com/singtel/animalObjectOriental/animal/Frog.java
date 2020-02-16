package com.singtel.animalObjectOriental.animal;

public class Frog extends Animal implements ISing,ISwim {
    @Override
    public void sing() {
        System.out.println("I'm frog and I'm singing");
    }

    @Override
    public void swim() {
        System.out.println("I'm frog and I'm swimming");
    }

    @Override
    public void walk(){
        System.out.println("I'm frog and I'm walking");
    }
}
