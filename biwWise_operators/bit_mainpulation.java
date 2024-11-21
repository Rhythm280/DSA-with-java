package biwWise_operators;

public class bit_mainpulation {
    public static void main(String[] args) {
        // find wather the number is odd or even 
        int num = 10;
        if((num & 1) == 1) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }
}
