package search.questions;
// conpleate the leetcode question: 1095 (https://leetcode.com/problems/find-in-mountain-array/)
public class find_in_mountain_array {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     * public int get(int index) {}
     * public int length() {}
     * }
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 4, 3, 2, 0 };
        int target = 3;
        System.out.println(findInMountainArray(target, arr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = search(mountainArr, target, 0, peak);
        int secondTry = search(mountainArr, target, peak + 1, mountainArr.length - 1);
        if (firstTry != -1) {
            return firstTry;
        }
        return secondTry;
    }

    static int search(int[] arr, int target, int start, int end) {
        boolean isass = arr[start] < arr[end];
        while (start <= end) {
            // int mid = start + end / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            }

            if (isass) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in decreasing part of array this may be the answar but we will look at
                // left
                end = mid;
            } else {
                // we are in increasing part of array this will not be our answer so we will
                // look at right
                start = mid + 1;
            }
            // in the end, atart == end and pointing to the largest number beacse of the 2
            // checks above
            // start and end always trying to find max element in the above 2 checks
            // hence, when they are pointing to just 1 element, this is the maximun one
            // because that is what the checks say.
            // more elaboration: at every point of time at start and end, they have the best
            // possible answer till that time and if we are saying that only one element
            // remaing hence, it our best possible answer
        }
        return end; // we can start as both are equal
    }
}