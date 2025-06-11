package PropertiesOfOOPs.polymorphism;

public class Shapes {
    // late binding
    void area() {
        System.out.println("I am in Shapes");
    }

    static void greeting() {
        System.out.println("Hello! This is Shapes class");
    }

    // early binding
    // final void area() {
    //      if i put final over here then we can not override this method and also used to prevent inheritence.
    //     System.out.println("I am in Shapes");
    // }
}
