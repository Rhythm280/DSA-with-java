package placement_training;

public class basic_01 {
    public static void main(String[] args) {
        char ch = 'A';
        char ch2 = 65;
        char ch3 = '\u0041';
        int x = 65;
        System.out.println(ch + ch3);
        System.out.println((char) (ch + 2));
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println((char) x);

        // wrapper class
        Integer i = 10;
        System.out.println(i.toString() + ch3);
        System.out.println(i.SIZE / 8);

        // autoboxing: premitive to class and unboxing: class to premitive
        int x1 = 5;
        Integer i1 = new Integer(x1); // boxing
        System.out.println(x1);
        System.out.println(i1);
        Integer i2 = new Integer(100); // boxing
        int x2 = i2;
        System.out.println(x2 + i2);
        System.out.println(i2);

        // operators
        // unary (++, --, ~, !), binary (+, -, *, /, %), ternary
        // pre: ++a post: a++

        int a = 5, x3 = -5;
        int b;
        b = ++a + ++a;
        System.out.printf("%d \n", b);
        System.out.println(~x3);

    }
}

// wraper class:
// Byte: byte value
// Short: short value
// Integer
// Long
// Float
// Double
// Boolean
// Character