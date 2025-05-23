package OOPs;

public class wrraperClass {
    public static void main(String[] args) {
        Integer a = 10; // Integer is a wrapper class
        Integer b = 20;
        swap(a, b);
        // a and b are still 10 and 20
        // because they are passed by value
        // in Java, even though they are objects
        // but the reference is passed by value
        // so the original values of a and b are not changed
        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 20
        // to swap the values of a and b, we need to use a mutable object
        // or we can use a wrapper class
        // final int bonus = 1000; // final is a keyword in Java
        // bonus = 2000; // this will give an error because bonus is final
        A obj;
        for(int i = 0; i < 1000000000; i++) {
            obj = new A("joy");
        }

    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        A s1 = new A("joy");
        s1.name = "joy";
        // s1 = new A("sfsdfd");
        // When a non-primitive is final, we cannot reassign it.

    }

}

class A {
    final int num = 10;
    String name;
    public A (String name) {
        System.out.println("sjdlfksjfljksnldhkl");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}