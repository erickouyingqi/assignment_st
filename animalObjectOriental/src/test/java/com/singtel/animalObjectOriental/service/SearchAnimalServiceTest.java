package com.singtel.animalObjectOriental.service;

import com.singtel.animalObjectOriental.animal.Duck;
import com.singtel.animalObjectOriental.animal.IAnimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SearchAnimalServiceTest {

    @Autowired
    private ISearchAnimalService queryAnimalService;

    @Test
    public void queryAnimalByNameTest() throws Exception {
        IAnimal animal = queryAnimalService.queryAnimalByName("Duck");
        Assert.assertTrue(animal instanceof Duck);
    }

    @Test
    public void getAllAnimalsListTest() throws Exception {
        List<IAnimal> animalList = queryAnimalService.getAllAnimals();
        Assert.assertEquals(13, animalList.size());
    }

    @Test
    public void countingAnimals() throws Exception {
        AnimalCount animalCount = queryAnimalService.getAnimalNumberByBehavior();
        Assert.assertEquals(9, animalCount.getWalkCount());
        Assert.assertEquals(4, animalCount.getFlyCount());
        Assert.assertEquals(8, animalCount.getSingCount());
        Assert.assertEquals(7, animalCount.getSwimCount());
    }
}
