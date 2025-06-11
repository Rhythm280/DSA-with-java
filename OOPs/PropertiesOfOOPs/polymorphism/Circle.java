package PropertiesOfOOPs.polymorphism;

public class Circle extends Shapes {
    // this runwhen the object of Circle is created. hence, this will override the parent method
    @Override // this is annotation which will help us to check whether the method is been overridden or not
    void area() {
        System.out.println("area is pi * r * r");
    }

    // @Override
    static void greeting() {
        System.out.println("Hello! This is Circle class");
    }
}
