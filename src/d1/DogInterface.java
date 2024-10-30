package d1;

public class DogInterface {
    public static void main(String[] args) {
        Animal dog = new DogAnimal();
        dog.bark();
    }
}

interface Animal {
    void bark();
}
class DogAnimal implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog bark");
    }
}
/*
* Write a Java program to create an Animal interface with a method called bark() that takes no arguments and returns void.
* Create a Dog class that implements Animal and overrides speak() to print "Dog is barking"
* */
