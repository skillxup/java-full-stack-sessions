public abstract class Animal {
    // ....
    public abstract void animalSound();
}

public class Lion extends Animal {
    // ...
    @Override
    public void animalSound() {
        System.out.println("Roar");
    }
}

public class Dog extends Animal {
    // ... 
    @Override
    public void animalSound() {
        System.out.println("Woof");
    }
}