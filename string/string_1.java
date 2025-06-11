public class string_1 {
    public static void main(String[] args) {
        // strings in java
        String name = "Rhythm Gupta";
        System.out.println(name);

        // strings are immutable in java because, if we change the one string object it
        // will affect other variable having the same string objects.
        String a = "Rhythm";
        String a1 = a;
        System.out.println(a);
        // in this, we are not changing the object we are creating a new object.
        a = "Gupta";
        System.out.println(a.toString());
        System.out.println(a1);
    }
}
