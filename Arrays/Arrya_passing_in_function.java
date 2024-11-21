package Arrays;

import java.util.Arrays;

public class Arrya_passing_in_function {
    public static void main(String[] args) {
        int[] arr = { 434, 655, 35, 62, 64, 134 };
        System.out.println(Arrays.toString(arr));
        change(arr); // the copy of the reference variable is passed in the method.
        System.out.println(Arrays.toString(arr));// so, the value of the arr will also get affected
    }

    // they both variale point towards the same object in heap memory.
    static void change(int[] arr) {
        arr[2] = 99; // it modified the value of array value at index "2", not create a new object.
    }
}
