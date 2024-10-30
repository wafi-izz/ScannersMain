package d1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("ali",50);
        Person p2 = new Person("john",10);

        System.out.println(p1.name);
        System.out.println(p1.age);

        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}

class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
 * Write a Java program to create a class called "Person" with a name and age attribute.
 * Create two instances of the "Person" class, set their attributes using the constructor,
 * and print their name and age.
 * */
