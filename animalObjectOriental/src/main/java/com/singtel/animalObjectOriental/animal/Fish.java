package com.singtel.animalObjectOriental.animal;

public class Fish implements IAnimal,ISwim {
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println("I'm fish and I'm swimming");
    }
}
