package sorting_algos;
import java.util.*;
public class missing_number2 {
    /*
    Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
     */
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        int i = 0;
        while (i<nums.length){
            int correct  = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=j+1)list.add(j+1);
        }
        return list;
    }
    static void swap(int[]arr, int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
