package com.singtel.animalObjectOriental.animal;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    public void birSingTest(){
        Bird bird = new Bird();
        bird.sing();
    }

    @Test
    public void duckTest(){
        Duck duck = new Duck();
        duck.sing();
        duck.swim();
        duck.fly();
        duck.walk();
    }

    @Test
    public void chickenTest(){
        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.sing();
    }

    @Test
    public void roosterTest(){
        Rooster rooster = new Rooster();
        rooster.walk();
        rooster.sing();
        rooster.sing("Chinese");
    }

    @Test
    public void roosterDelegatorTest(){
        RoosterDelegation roosterDelegation = new RoosterDelegation();
        roosterDelegation.walk();
        roosterDelegation.sing();
    }

    @Test
    public void parrotTest(){
        Parrot parrot = new Parrot();
        parrot.setLiveWith(new Dog());
        parrot.sing();

        parrot.setLiveWith(new Cat());
        parrot.sing();

        parrot.setLiveWith(new Rooster());
        parrot.sing();

        parrot.setLiveWith(new Duck());
        parrot.sing();
    }
}
