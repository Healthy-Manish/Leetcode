package sorting_algos;

import java.util.Arrays;
/*
Given an unsorted integer array nums, return the smallest missing positive integer.

        You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



        Example 1:

        Input: nums = [1,2,0]
        Output: 3
        Explanation: The numbers in the range [1,2] are all in the array.
        
 */
public class first_missing_positive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(cyclic(nums));
    }
    static int cyclic(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[correct]){
             swapp(arr, i, correct);
            }else i++;
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
    static void swapp(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
