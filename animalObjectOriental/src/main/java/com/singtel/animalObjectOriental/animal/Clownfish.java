package com.singtel.animalObjectOriental.animal;

public class Clownfish extends Fish {

    public void makeJokes(){
        System.out.println("I make jokes");
    }

    @Override
    public String getSize(){
      return "small";
    }

    @Override
    public String getColor(){
        return "orange";
    }
}
