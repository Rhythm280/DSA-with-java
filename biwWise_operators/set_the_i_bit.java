package biwWise_operators;

public class set_the_i_bit {
    public static int setBit(int num, int i) {
        // Create the mask
        int mask = 1 << i;

        // Perform bitwise OR to set the i-th bit
        return num | mask;
    }

    public static void main(String[] args) {
        int num = 13; // Binary: 1101
        int i = 2; // Set the 2nd bit from the right (index 1)

        int result = setBit(num, i);
        System.out.println("Original number: " + num);
        System.out.println("Number after setting the " + i + "th bit: " + result);
    }
}
