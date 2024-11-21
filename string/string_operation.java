import java.util.ArrayList;

public class string_operation {
    public static void main(String[] args) {
        // concaination
        System.out.println((char) ('a' + 'b')); // ?
        // when we try to concatinate 2 charactr valuse java will convert then into its
        // ASCII value and the print the addition of both to to convert the intger value
        // to char ve cn use (char) method
        System.out.println("a" + "b"); // ab

        System.out.println(56 + "a"); // 56a
        // when an integer is added to a string then it is converted to it wrapper chall
        // integer which will call tostring() method.
        System.out.println(new ArrayList<>() + "a"); // []a
        // it will also call toString() method.
        System.out.println(new Integer(56) + "a" + new ArrayList<>()); // 56a[]
        // to do this there has to be one string in this expression it will work on any
        // randon objects.

    }
}
