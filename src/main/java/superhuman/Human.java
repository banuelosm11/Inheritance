package superhuman;

/**
 * Created by aurorabanuelos on 5/1/17.
 */
public class Human {


    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human(String name, int age, String gender, String occupation, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name1){name = name1;}

    public void setAge(int age1) {
        age = age1;
    }

    public void setGender(String gender1) {
        gender = gender1;
    }

    public void setOccupation(String occupation1) {
        occupation = occupation1;
    }

    public void setAddress(String address1) {
        address = address1;
    }

    public String toString(){
        return getClass().getName()
            + "\n" + "name= " + name
            + "\n" + "age= " + age
            + "\n" + "gender= " + gender
            + "\n" + "occupation= " + occupation
            + "\n" + "address= " + address;
    }
}
