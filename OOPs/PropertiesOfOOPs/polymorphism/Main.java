package PropertiesOfOOPs.polymorphism;

public class Main {
    public static void main(String[] args) {
        // polymorphism: it stands for many ways to represent single entity or item. it occurs during inheritance.
        // the act of representing single thing in multiple ways.
        Shapes s = new Shapes();
        Circle c = new Circle();
        Shapes sq = new Square(); // in this, it will have access to the object which we have called. how?
        System.out.println(sq);

        sq.area();
        s.area();
        c.area();

        // types of polymorphism: 
        // 1. compile-time polymorphism / static polymorphism: it is achived by method overloading (same name of the method but change in forml arguments).
        //       - ex: multiple constructor.
        //       - java determines which constructor/method we need to call/run at compile time.
        // 2. run-time polymorphism / Dynamic polymorphism: it is achived by method overriding (when the subclass has the method just like the method in the superclass but the body of the method is different)
//               - java determines which method to call at compilr-time but which mwthod to run at run-time.

        Shapes.greeting(); // Hello! this is  Shapes class.
        sq.greeting(); // Hello! this is  Shapes class because, if the static method is inharited then there is no point in overiding them in the child class because the method in the parent class will always run no matter from which object reference we call it (it is static and it doesn't depends on the object)
        c.greeting(); // Hello! This is Circle class. but if this method is not available inside the child class then it will call the method present inside it's parent class which will print this in this case "Hello! This is Shapes class" because static methods can be inharited but we can't overide
    }
}
