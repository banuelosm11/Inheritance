package io.zipcoder.pets;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Bird extends Pet {

    public Bird (String name, String animalType){
        super(name, animalType);
    }

    @Override
    public String speak(){
        return "Chirp";
    }
}
