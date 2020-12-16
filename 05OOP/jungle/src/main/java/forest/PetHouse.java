package forest;

abstract class Animal {
  public void makeSound() {
  }
}
class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Woof!");
  }
}
public class PetHouse {
  public void allMakeSound() {
    Animal[] animals = {new Cat(), new Dog()};
    for (Animal animal: animals) {
      animal.makeSound();
    }
  }
}