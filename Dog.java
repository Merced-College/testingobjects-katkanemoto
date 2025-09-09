//Kanemoto
//9/9/25
//Dog class for my Dog objects

public class Dog {

    //data variables, they describe our Dog objects in the computer
    private String name;
    private int age;
    private String breed;

    //default constructor
    public Dog () {
        this.name = "Hank";
        this.age = 1;
        this.breed = "Lab";
    }

    //non-default constructor
    public Dog (String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //setters - accessors
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //getters - mutators
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String toString() {
        return name + ", " + age + ", " + breed;
    }

}//end Dog class