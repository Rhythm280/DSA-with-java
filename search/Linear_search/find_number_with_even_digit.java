package search.Linear_search;

public class find_number_with_even_digit {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 23, 532, 788, 42 },
                { 21, 3143, 51, 2, 123 },
                { 1, 2, 4 }
        };
        System.out.println(findnum(arr));
    }

    static int findnum(int[][] arr) {
        int count = 0;
        // for(int i = 0; i < arr.length; i++){
        // for(int j = 0; j < arr[i].length; j++){
        // if(even(arr[i][j])){
        // count++;
        // }
        // }
        // }
        // for-each loop:
        for (int[] i : arr) {
            for (int j : i) {
                if (even(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    static boolean even(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }
}
