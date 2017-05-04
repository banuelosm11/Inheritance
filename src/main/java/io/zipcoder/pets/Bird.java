package io.zipcoder.pets;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Bird extends Pet {

    public Bird (String name){
        super(name);
    }


    @Override
    public String speak(){
        return "Chirp";
    }
}
