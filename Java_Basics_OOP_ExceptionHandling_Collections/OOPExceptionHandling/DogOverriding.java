class Animal {
    public void animalSound() {
        System.out.println("Default Sound");
    }
}

public class DogOverriding extends Animal {
    public void animalSound() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.animalSound();
    }
}

/*
few more overriding examples;

Animal obj = new Animal();
obj.animalSound();
// this would call the Animal class method

Dog obj = new DogOverriding();
obj.animalSound();
// this would call the Dog class method

Animal obj = new DogOverriding();
// this would call the Dog class method

*/