package arrrays.easy;

import java.util.ArrayList;

public class leetcode5 {
    
    public static void main(String[] args) {
        int[] gain ={52,-91,72};
        ArrayList<Integer> altitudes = new ArrayList<>();
            int sum = 0;
        int max = 0;
        altitudes.add(0);
        for(int i = 0;i<gain.length;i++){
           altitudes.add(sum+gain[i]);
           sum = altitudes.get(i+1);
        }
        for(int i = 0;i<altitudes.size();i++){
            if(altitudes.get(i)>max)max = altitudes.get(i);
        }
        System.out.println(max);
}
}
