package pattern;

public class PascalTriangle {
    // public static void main(String[] args) {
    //     ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    //     for(int i = 0; i < 5; i++) {
    //         ArrayList<Integer> row = new ArrayList<>();
    //         for(int space = 0; space <= 5 - i; space++) {
    //             System.out.print(" ");
    //         }
    //         for(int j = 0; j <= i; j++) {
    //             if(j == 0 || j == i) {
    //                 row.add(1);
    //                 System.out.print(1 + " ");
    //             } else {
    //                 int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
    //                 row.add(value);
    //                 System.out.print(value + " ");
    //             }
    //         }
    //         result.add(row);
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 7, 8, 6, 3, 2, 1};
		System.out.println(result(arr));
	}

	public static int result(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while(s <= e) {
			int mid = s + (e - s) / 2;
			if(arr[mid] > arr[mid + 1]) {
				e = mid;
			} else {
				s = mid + 1;
			}
		}
		return arr[s];
	}
}
