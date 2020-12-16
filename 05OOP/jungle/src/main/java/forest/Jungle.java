package forest;

public class Jungle {
  private String[] animals = { "cat", "rabbit", "tiger", "snake", "fish", "elephant" };

  public void animateAnimalWorld() {
    for (String animal : animals) {
      say(animal);
    }
  }

  public void say(String animal) {
    switch (animal) {
      case "cat":
        System.out.println("Meo meo");
        break;
      case "rabbit":
        System.out.println("Bep bep");
        break;
      case "tiger":
        System.out.println("Roar Roar");
        break;
      case "snake":
        System.out.println("shi ... shi");
        break;
      case "fish":
        System.out.println("I am silent");
        break;
      case "elephant":
        System.out.println("Hoo Hooo...");
        break;
      default:
        System.out.println("I don't know");
    }
  }
}
