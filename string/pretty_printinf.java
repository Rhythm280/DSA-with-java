public class pretty_printinf {
    public static void main(String[] args) {
        // to do this we can use the format specifers and we can use it to print 2-digit
        // float number after the point
        float a = 3691.42734f;
        System.out.printf("%.2f", a);

        // we can also use it like this
        System.out.printf("My name is %s, i am %s", "Rhythm", "Cool");
        // these are othe rformat specirs like:
        // %c - characters
        // %d - decimal numbers
        // %e - exponential floating point number
        // %f - floating point numbr
        // %i - integer number
        // %o - octal number
        // %s - string
        // %u - unsigned decimal numbers
        // %x - hexadecimal number
        // %t - date/time
        // %n - new line

    }
}
