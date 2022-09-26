// abstract class
abstract class Animal {
    // abstract method
    public abstract void animalSound();
}

// define the class
public class DogAbstraction extends Animal {
    public void animalSound() {
        System.out.println("Woof");
    }
    public static void main(String[] args) {
        // Animal obj = new DogAbstraction();
        Animal obj = new DogAbstraction();
        obj.animalSound();
    }
}
