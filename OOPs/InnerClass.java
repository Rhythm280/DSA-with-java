public class InnerClass {
    static class A {
        String name;
        A(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        A obj = new A("joy");
        A obj1 = new A("Rhythm");
        InnerClass obj2 = new InnerClass();
        System.out.println(obj.name); // joy
        System.out.println(obj1.name); // Rhythm
        // Inner class can be static or non-static
        // static inner class can be accessed using class name
        // non-static inner class can be accessed using object of the outer class
        // but in this case, we cannot access the non-static inner class
        // because it is not defined in the outer class
        // so we need to create an object of the outer class to access the non-static inner class
    }
}
