package strings;

import java.util.ArrayList;

/*
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

 

Example 1:


Input: s = "codeelet", indices = [4,5,6,7,2,0,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */
public class leetcode11 {
    public static void main(String[] args) {
        String s = "codeelet";
        
        int[] indices =  {4,5,6,7,2,0,1,3};
        System.out.println(restoreString2(s,indices)); 
    }
    static public String restoreString(String s, int[] indices) {
       StringBuilder str = new StringBuilder("") ;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            list.add(indices[i]);
        }
        for (int i = 0; i < list.size(); i++) {
          char temp =  s.charAt(list.indexOf(i));
          str=  str.append(temp);
        }
        return str.toString();
    }

    //another solution
    static public String restoreString2(String s, int[] indices) {
        char []ans = new char[indices.length];
        for(int i=0; i<indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}

