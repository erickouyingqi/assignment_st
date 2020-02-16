package com.singtel.animalObjectOriental.animal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Dog extends Animal implements ISing,ISwim{
    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }

    @Override
    public void swim() {
        System.out.println("I'm dog and I am swimming");
    }
}
