package d1.a3;

public class AnimalInherit {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
    }
}
class Animal {
    public void makeSound(){
        System.out.println("animal sound");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("cat sound");
    }
}


/*
* Write a Java program to create a class called Animal with a method called makeSound().
* Create a subclass called Cat that overrides the makeSound() method to bark.
* */