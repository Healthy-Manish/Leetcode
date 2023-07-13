package arrrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode10 {
    /*
        The array-form of an integer num is an array representing its digits in left to right order.

    For example, for num = 1321, the array form is [1,3,2,1].
    Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.



    Example 1:

    Input: num = [1,2,0,0], k = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
     */
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("100");
        String st = str.toString();
        System.out.println(st);
        int num = Integer.parseInt(st);
        System.out.println(num);
        System.out.println(st.getClass());
        StringBuilder str2 = new StringBuilder("");

        int[] num2 = {1, 2, 0, 0};
        int k = 34;
//        for (int i = 0; i < num2.length; i++) {
//            str2.append(String.valueOf(num2[i]));
//        }
//        int num3 = Integer.parseInt(str2.toString());
//        int k = 34;
//        System.out.println(num3+k);
//        int num4 = num3+k;
//        List<Integer> list = new ArrayList<>();
//        while (num4>0){
//            int temp = num4%10;
//            list.add(0,temp);
//            num4=num4/10;
//
//        }
//        System.out.println(list);
        System.out.println(addToArrayForm(num2, k));
    }


    static public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }

        //add remaining digits of k is any
        while (k > 0) {
            list.add(0, k % 10);
            k = k / 10;
        }
        return list;
    }
}
