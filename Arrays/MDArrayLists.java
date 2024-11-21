package Arrays;

import java.util.Scanner;
// import java.util.Arrays;
import java.util.ArrayList;

public class MDArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        // Initialization of ArrrayList inside the each ArrayList.
        for (int i = 0; i < 5; i++) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                lists.get(i).add(in.nextInt());
            }
        }
        System.out.println(lists);
        in.close();
    }
}
