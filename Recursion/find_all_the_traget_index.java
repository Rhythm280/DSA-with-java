package Recursion;

import java.util.ArrayList;

public class find_all_the_traget_index {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 9, 18, 2, 18};
        findAllIndex1(arr, 18, 0);
        System.out.println(list);
        ArrayList<Integer> answer1 = new ArrayList<>();
        System.out.println(findAllIndex2(arr, 18, 0, answer1));
        ArrayList<Integer> answer2 = new ArrayList<>();
        System.out.println(findAllIndex2(arr, 18, 0, answer2));

    }
    static ArrayList<Integer> list = new ArrayList<>();

    public static void findAllIndex1(int[] arr, int target, int i) {
        if (arr.length == i) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        findAllIndex1(arr, target, i + 1);
    }

    // if we dont wnat to create an array list for this problem them we can just return the argument for it.
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i, ArrayList<Integer> answer) {
        if (arr.length == i) {
            return answer;
        }
        if (arr[i] == target) {
            answer.add(i);
        }
        return findAllIndex2(arr, target, i + 1, answer);
    }

    public static ArrayList<Integer> findAllIndex3(int[] arr, int target, int i) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (i == arr.length) {
            return ans;
        }
        if (arr[i] == target) {
            ans.add(i);
        }
        ArrayList<Integer> answer = findAllIndex3(arr, target, i + 1);
        ans.addAll(answer);
        return ans;
    }
}
