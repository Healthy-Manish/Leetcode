
package sorting_algos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class missing_number {
   /*
   Given an array nums containing n distinct numbers in the range [0, n],
   return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are
in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
    */
    public static void main(String[] args) {
        int[]arr ={ 0,3,2,1,4,5,6,8,7,9};

        System.out.println(missing(arr));
    }
    static int missing(int[]arr){

        int i = 0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]  ){
                swap(arr,i,correct);
            }else i++;
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j)return j;
        }
        return arr.length;
    }
    static void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }


}
