package com.singtel.animalObjectOriental.service;

import com.singtel.animalObjectOriental.animal.IAnimal;

import java.util.List;

public interface ISearchAnimalService {
    public AnimalCount getAnimalNumberByBehavior();
    public IAnimal queryAnimalByName(String animalName);
    public List<IAnimal> getAllAnimals();
}
