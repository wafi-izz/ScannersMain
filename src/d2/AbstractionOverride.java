package d2;

public class AbstractionOverride {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal rat = new Rat();
        dog.numberOfLimbs();
        rat.numberOfLimbs();

    }
}

interface Animal {
    void numberOfLimbs();
    boolean canSwim();
}
abstract class MainAnimal implements Animal {
    @Override
    public void numberOfLimbs() {
        System.out.println("Number of Limbs for a default animal is :" + 2);
    }
    @Override
    public boolean canSwim() {
        return false;
    }
}
class Dog implements Animal {
    @Override
    public void numberOfLimbs() {
        System.out.println("Dogs have : " + 4 + " limbs");
    }
    @Override
    public boolean canSwim() {
        return false;
    }
}
class Fish implements Animal {
    @Override
    public void numberOfLimbs() {
        System.out.println("Fishes have : " + 0 + " limbs");
    }
    @Override
    public boolean canSwim() {
        return true;
    }
}
class Rat extends MainAnimal implements Animal {

}

/*
* vehicle abstract class
* normal car class
* sub class toyota
* */
