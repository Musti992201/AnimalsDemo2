package Animal2;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String animalloud;

    public Animal(String name, int age, String species, String animalloud) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.animalloud = animalloud;


    }
    public String giveAnimalloud(){
        return name + " makes " + animalloud;}

    public String getNameandAge(){
        return name + "is"+ age +"years old";}

    public String ageCategory(){
        if(age<=2){
            return "baby animal";
        }
        else if(age>2&&age<=4){
            return "young animal";
        }
        else{
            return "old animal";}
    }



    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public int getAge() {
        return age;}

    public void setAge(int age) {
        this.age = age;}

    public String getSpecies() {
        return species;}

    public void setSpecies(String species) {
        this.species = species;}

    public String getAnimalloud() {
        return animalloud;}

    public void setAnimalloud(String animalloud) {
        this.animalloud = animalloud;}

}
