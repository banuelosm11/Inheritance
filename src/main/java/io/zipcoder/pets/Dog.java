package io.zipcoder.pets;

/**
 * Created by aurorabanuelos on 5/4/17.
 */
public class Dog extends Pet {

    public Dog (String name, String animalType){
        super(name, animalType);
    }

    @Override
    public String speak(){
        return "Woof";
    }
}
