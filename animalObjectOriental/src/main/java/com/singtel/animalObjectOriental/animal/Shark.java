package com.singtel.animalObjectOriental.animal;

public class Shark extends Fish{
   public void eatFish(){
       System.out.println("I eat other fish");
   }

    @Override
    public String getSize(){
        return "large";
    }

    @Override
    public String getColor(){
        return "grey";
    }
}
