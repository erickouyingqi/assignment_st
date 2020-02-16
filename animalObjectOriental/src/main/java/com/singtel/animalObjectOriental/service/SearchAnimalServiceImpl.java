package com.singtel.animalObjectOriental.service;

import com.singtel.animalObjectOriental.animal.*;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.*;

@Service("queryAnimalService")
public class SearchAnimalServiceImpl implements ISearchAnimalService{
    private Map<String, IAnimal> animalMap;

    @PostConstruct
    private void init(){
        animalMap = new HashMap<String,IAnimal>();
        animalMap.put("Bird",new Bird());
        animalMap.put("Duck",new Duck());
        animalMap.put("Chicken",new Chicken());
        animalMap.put("Rooster",new Rooster());
        Parrot parrot = new Parrot();
        parrot.setLiveWith(new Cat());
        animalMap.put("ParrotLiveWithCat",parrot);
        animalMap.put("Fish",new Fish());
        animalMap.put("Shark",new Shark());
        animalMap.put("Clownfish",new Clownfish());
        animalMap.put("Dolphin",new Dolphin());
        animalMap.put("Frog",new Frog());
        animalMap.put("Dog",new Dog());
        animalMap.put("Butterfly",new Butterfly());
        animalMap.put("Cat",new Cat());
    }

    public AnimalCount getAnimalNumberByBehavior(){
        int flyCount=0;
        int walkCount=0;
        int singCount=0;
        int swimCount=0;
        AnimalCount animalCount;

        Map.Entry<String,IAnimal> entry;
        IAnimal animalObj;
        Iterator<Map.Entry<String,IAnimal>> it=animalMap.entrySet().iterator();
        if(null!=animalMap && 0<animalMap.size()) {

            while(it.hasNext()){
                entry=it.next();
                animalObj=entry.getValue();
                try {
                    animalObj.getClass().getMethod("fly", null);
                    flyCount++;
                }catch (NoSuchMethodException e){
                }catch (NoSuchElementException ex){
                }

                try {
                    animalObj.getClass().getMethod("walk", null);
                    walkCount++;
                }catch (NoSuchMethodException e) {
                }catch (NoSuchElementException ex){

                }

                try {
                    animalObj.getClass().getMethod("sing", null);
                    singCount++;
                }catch (NoSuchMethodException e){
                }catch (NoSuchElementException ex){
                }

                try {
                    animalObj.getClass().getMethod("swim", null);
                    swimCount++;
                }catch (NoSuchMethodException e){
                }catch (NoSuchElementException ex){
                }
            }
        }

        System.out.println("flyCount ="+flyCount);
        System.out.println("walkCount ="+walkCount);
        System.out.println("singCount ="+singCount);
        System.out.println("swimCount ="+swimCount);
        animalCount=new AnimalCount();
        animalCount.setFlyCount(flyCount);
        animalCount.setWalkCount(walkCount);
        animalCount.setSingCount(singCount);
        animalCount.setSwimCount(swimCount);

        return animalCount;
    }

    public IAnimal queryAnimalByName(String animalName){
        return animalMap.get(animalName);
    }

    public List<IAnimal> getAllAnimals(){
        List<IAnimal> animalList=new ArrayList<>();
        Map.Entry<String, IAnimal> entry;
        Set<Map.Entry<String,IAnimal>> entrySet=animalMap.entrySet();
        Iterator<Map.Entry<String,IAnimal>> it=entrySet.iterator();
        while(it.hasNext()){
            entry=(Map.Entry<String,IAnimal>)it.next();
            animalList.add(entry.getValue());
        }

        return animalList;
    }


}
