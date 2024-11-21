public class string_comparison {
    public static void main(String[] args) {
        // '==' method checks both the objects and referece variable are pointing
        // towards the same object or not.
        String a = "Rhythm";
        String b = "Rhythm";
        if (a == b) {
            System.out.println("True");
        }

        // to create different object of same value we can use 'new' keyword it will
        // create the values outside the string pool inside the heap memory.
        String name1 = new String("Rhythm");
        String name2 = new String("Rhythm");
        if (name1 != name2) {
            System.out.println("False");
        }

        // equals() method is used when we only need to check values beacuse it only
        // cares about the value
        System.out.println(name1.equals(name2));

        if (a.equals(name1)) {
            System.out.println(true);
        }

    }
}
