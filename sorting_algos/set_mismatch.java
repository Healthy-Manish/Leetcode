package sorting_algos;

import java.util.Arrays;
/*
You have a set of integers s, which originally contains
all the numbers from 1 to n. Unfortunately, due to some
 error, one of the numbers in s got duplicated to another
  number in the set, which results in repetition of one
  number and loss of another number.

You are given an integer array nums representing the
 data status of this set after the error.

Find the number that occurs twice and the number that
is missing and return them in the form of an array.



Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
 */
public class set_mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
//        cyclic(arr);
        System.out.println(Arrays.toString(cyclic(arr)));
    }
    static int[] cyclic(int[]arr){
        int[] num = new int[2];
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                num[0] = arr[j];
                num[1] = j+1;
            }
        }
        return num;
    }
    static void swap(int[]arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

}
