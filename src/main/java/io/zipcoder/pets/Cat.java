package io.zipcoder.pets;

/**
 * Created by aurorabanuelos on 5/4/17.
 */
public class Cat extends Pet {

    public Cat (String name, String animalType){
        super(name, animalType);
    }

    @Override
    public String speak(){
        return "Meow";
    }
}
