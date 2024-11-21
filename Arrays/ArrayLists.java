package Arrays;

import java.util.Scanner;
// import java.util.Arrays;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(231); //it is used add the item in the array, we can add as many
        // times we want in this.
        // list.add(231231);
        // list.add(2316566);
        // list.add(231415);
        // list.add(54445511);
        // list.add(25131);
        // list.add(41231);
        // list.add(23111);
        // list.add(2341);
        // list.clear(); //it clears the ArrayList.

        // get input from the user:
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list); // ArrayList is converted to the string by itself
        in.close();
    }
}
// size of the ArrayList is actually fixed internaly
// say if ArrayList fill by some amount:
// it will create a new arraylist of double the size.
// old elements are copied in the new one.
// old one is deleated.
// ex: [1,2,3,4,5] ----->> [1,2,3,4,5,6,7, , , , ]
// it constance time complexity: O(1);