package Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "chicken: cục cục cưc";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }

}
