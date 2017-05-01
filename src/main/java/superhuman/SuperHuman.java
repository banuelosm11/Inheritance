package superhuman;

/**
 * Created by aurorabanuelos on 5/1/17.
 */
public class SuperHuman extends Human {

    private Boolean good;
    private String heroName;
    private String superAbility;

    public SuperHuman(String name, int age, String gender, String occupation, String address){

        super(name, age, gender, occupation, address);
        this.good = good;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public Boolean getGood(){
        return good;
    }

    public String getHeroName(){
        return heroName;
    }

    public String getSuperAbility(){
        return superAbility;
    }

    public void setGood(boolean goodOrBad){
        good = goodOrBad;
    }

    public void setHeroName(String hero){
        heroName = hero;
    }

    public void setSuperAbility(String ability){
        superAbility = ability;
    }

    public String toString(){
        return super.toString()
            +"[good=" + good
            +"heroName=" + heroName
            +"superAbility" + superAbility
            +"]";
    }
}
