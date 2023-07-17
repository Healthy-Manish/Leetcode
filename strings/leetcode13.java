package strings;

import java.util.HashMap;

public class leetcode13 {
    public static void main(String[] args) {
        String s  ="wffg";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static public int lengthOfLongestSubstring(String s) {

        int max = 0;
        HashMap<Integer,Character>map = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if (map.containsKey(i)){
                if(map.size()>max)max = map.size();
                for (int j = 0; j < map.size(); j++) {
                    if(map.get(j)==s.charAt(i)){
                        map.remove(j);
                        break;
                    }
                    else {
                        map.remove(j);
                    }
                }
            }
            else {
                map.put(i,s.charAt(i));
                max++;
            }
        }
//        if(map.size()>count)return map.size();
       return max ;
    }
}
