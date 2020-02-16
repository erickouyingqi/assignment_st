package com.singtel.animalObjectOriental.animal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Dolphin implements IAnimal, ISwim {
    @Override
    public void swim() {
        System.out.println("I'm dolphin and I'm swimming");
    }
}
