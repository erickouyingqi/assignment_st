package com.singtel.animalObjectOriental.controller;

import com.singtel.animalObjectOriental.animal.IAnimal;
import com.singtel.animalObjectOriental.service.AnimalCount;
import com.singtel.animalObjectOriental.service.ISearchAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class SearchAnimalController {

    @Autowired
    private ISearchAnimalService queryAnimalService;

    @PostMapping("/queryAnimal")
    @ResponseBody
    public IAnimal queryAnimalByName(@RequestParam(value="animalName") String animalName){
        return queryAnimalService.queryAnimalByName(animalName);
   }

   @PostMapping("/getAllAnimalList")
   @ResponseBody
   public List<IAnimal> getAllAnimalList(){
        return queryAnimalService.getAllAnimals();
   }

    @PostMapping("/countingAnimal")
    @ResponseBody
    public AnimalCount countingAminals(){
        return queryAnimalService.getAnimalNumberByBehavior();
    }
}
