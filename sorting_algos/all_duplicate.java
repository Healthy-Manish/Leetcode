package sorting_algos;
import java.util.*;
public class all_duplicate {

    /*
    Given an integer array nums of length n where all the integers of
     nums are in the range [1, n] and each integer appears once or twice,
     return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
     */
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static public List<Integer> findDuplicates(int[] nums) {
        int i  = 0;
        List<Integer>list = new ArrayList<>();
        while (i<nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }
        for (int j = 0; j <nums.length; j++) {
            if (nums[j]!=j+1){
                 list.add(nums[j]);
            }
        }
        return list;
    }
    static void swap(int[]arr,int first,int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }
}
