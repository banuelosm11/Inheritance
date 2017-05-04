package io.zipcoder.pets;

/**
 * Created by aurorabanuelos on 5/4/17.
 */
public class Dog extends Pet {

    public Dog (String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Woof";
    }
}
