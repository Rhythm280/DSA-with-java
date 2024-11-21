package search.Linear_search;

import java.util.Arrays;

public class richest_customer_wealth {
    public static void main(String[] args) {
        int arr[][] = {
                { 13243, 2314, 32432, 7324, 4412 },
                { 214310, 3143300, 34252100, 2123400, 1241400 },
                { 13241, 3413242, 41342 }
        };
        System.out.println(Arrays.toString(richest_customer(arr)));
    }

    static int[] richest_customer(int[][] arr) {
        int max = 0;
        int customer = 0;
        for (int i = 0; i < arr.length; i++) {
            int amount = 0;
            for (int j = 0; j < arr[i].length; j++) {
                amount += arr[i][j];
                customer = i;
            }
            if (max < amount) {
                max = amount;
            }
        }
        return new int[] { max, customer };
    }
}
