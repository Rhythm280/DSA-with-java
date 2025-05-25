package PropertiesOfOOPs.polymorphism;

public class Main {
    public static void main(String[] args) {
        // polymorphism: it stands for many ways to represent single entity or item. it occurs during inheritance.
        // the act of representing single thing in multiple ways.
        Shapes s = new Shapes();
        Circle c = new Circle();
        Shapes sq = new Square(); // in this, it will have access to the object which we have called. how?

        sq.area();

        // types of polymorphism: 
        // 1. compile-time polymorphism / static polymorphism: it is achived by method overloading (same name of the method but change in forml arguments).
        // - ex: multiple constructor.
        // - java determines which constructor/method we need to call/run at compile time.
        // 2. run-time polymorphism / Dynamic polymorphism: it is achived by method overriding (when the subclass has the method just like superclass but the body is different)
    }
}
