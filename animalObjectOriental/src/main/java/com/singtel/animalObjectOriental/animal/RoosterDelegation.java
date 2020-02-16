package com.singtel.animalObjectOriental.animal;

public class RoosterDelegation {
    Chicken chicken = new Chicken();
    void sing(){
        System.out.println("Cock-a-doodle-doo");
    }

    void walk(){
        chicken.walk();
    }

}
