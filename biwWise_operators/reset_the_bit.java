package biwWise_operators;

public class reset_the_bit {
    public static int resetBit(int num, int i) {
        // Create the mask
        int mask = ~(1 << i);

        // Perform bitwise AND to reset the i-th bit
        return num & mask;
    }

    public static void main(String[] args) {
        int num = 13; // Binary: 1101
        int i = 2; // Reset the 2nd bit from the right (index 1)

        int result = resetBit(num, i);
        System.out.println("Original number: " + num);
        System.out.println("Number after resetting the " + i + "th bit: " + result);
    }
}