
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MysteriousPresent {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int w1 = sc.nextInt();
            int h1 = sc.nextInt();
            row.add(w1);
            row.add(h1);
            row.add(i); // Keep original index
            list.add(row);
        }

        list.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0); // width ascending
            } else {
                return b.get(1) - a.get(1); // height descending
            }
        });

        System.out.println(findNumberOfChins(list, w, h));

        ArrayList<Integer> ans = new ArrayList<>(numberOfEnvolups(list, w, h));
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int findNumberOfChins(ArrayList<ArrayList<Integer>> list, int w, int h) {
        int chains = 0;
        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) > w && list.get(i).get(1) > h) {
                chains++;
                w = list.get(i).get(0);
                h = list.get(i).get(1);
            }
        }
        return chains;
    }

    public static ArrayList<Integer> numberOfEnvolups(ArrayList<ArrayList<Integer>> list, int w, int h) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) > w && list.get(i).get(1) > h) {
                res.add(list.get(i).get(2) + 1);
                w = list.get(i).get(0);
                h = list.get(i).get(1);
            }
        }
        return res;
    }
}
