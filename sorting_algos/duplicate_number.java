package sorting_algos;

public class duplicate_number {

    /*
    Given an array of integers nums containing n + 1 integers where each
    integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
     */
    public static void main(String[] args) {
        int[] nums = {1,3,4,3,2};
        System.out.println(findDuplicate(nums));
    }
    static public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                    return nums[j];

            }
        }
        return -1;

    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
