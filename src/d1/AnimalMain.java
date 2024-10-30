package d1;

public class AnimalMain {
    public static void main(String[] args) {
        Dog d1 = new Dog("alex","chewawa");
        Dog d2 = new Dog("boi","german shepard");

        System.out.println(d1.name);
        System.out.println(d1.breed);
        System.out.println(d2.name);
        System.out.println(d2.breed);
    }
}

class Dog {
    public String name;
    public String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

/*
* Write a Java program to create a class called "Dog" with a name and breed attribute.
* Create two instances of the "Dog" class,
* set their attributes using the constructor and modify the attributes using the setter methods
* and print the updated values.
* */
