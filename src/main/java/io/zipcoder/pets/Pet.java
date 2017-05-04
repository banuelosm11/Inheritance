package io.zipcoder.pets;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Pet {

    private String name;


    public Pet (String name){
        this.name = name;
    }

    public String speak(){
        return "Sound";
    }

    public String getName (){ return name; }

}
