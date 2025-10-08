package java21.abstractions;

abstract class Animal {
    public abstract void sound();
}

class DogSound extends Animal {
    public void sound() {
        System.out.println("Dog is Barking");
    }
}

class LionSound extends Animal {
    public void sound() {
        System.out.println("Lion is Roaring");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        DogSound dogSound = new DogSound();
        dogSound.sound();

        LionSound lionSound = new LionSound();
        lionSound.sound();
    }
}
