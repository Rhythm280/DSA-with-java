package PropertiesOfOOPs.polymorphism;

public class Square extends Shapes{
    @Override
    void area() {
        System.out.println("area is square of side");
    }

    // @Override
    static void greeting() {
        System.out.println("Hello! This is Square class");
    }
}
