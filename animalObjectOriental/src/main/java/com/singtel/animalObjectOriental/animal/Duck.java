package com.singtel.animalObjectOriental.animal;

public class Duck extends Bird implements ISwim {
    private String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
