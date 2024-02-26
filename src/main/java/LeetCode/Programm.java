package LeetCode;

import java.util.Arrays;

public class Programm {
    /*
    public static void main(String[] args) {
        int target = 6;
        int[] arr = {3, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    int[] arrNew = {i, j};
                    System.out.println(Arrays.toString(arrNew));
                }
            }
        }
    }
*/

    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int number = 6;
        System.out.print(Arrays.toString(twoSum(array, number)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    int[] arrNew = {i, j};
                    return arrNew;

                }
            }
        }
        return null;
    }
}
