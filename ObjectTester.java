public class ObjectTester {

    public static void main (String[] args) {

        //make a Dog object - instantiation
        Dog dog1 = new Dog();
        System.out.println(dog1);

        //make a Dog object - use non-default constructor
        Dog dog2 = new Dog("Karl", 3, "golden retriever");
        System.out.println(dog2);

        dog2.setName("Paul");
        System.out.println(dog2);

        //only print dogs name
        System.out.println(dog2.getName());

    }//end main

}//end class