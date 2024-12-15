package java_program;

public class Main {
    public static void main(String[] args) {
        byte b = 10;
        char c = 'h';
        short s = 1002;
        int i = 1002323;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
        System.out.println("Hello World!....");
    }
}