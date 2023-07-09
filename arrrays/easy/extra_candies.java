package arrrays.easy;

import java.util.ArrayList;
import java.util.List;

public class extra_candies {

        public static void main(String[] args) {
            int[] candies = {2,3,5,1,3};
            int extra_candies = 3;
          System.out.println(kidsWithCandies(candies,extra_candies));
           
        }

        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>(candies.length);
         
            int max = 0;
           for (int i = 0; i < candies.length; i++) {
              if (candies[i]>max) max = candies[i];
            } 
            for (int i = 0; i < candies.length; i++) {
                if(candies[i]+extraCandies>= max){
                    result.add(true);
                }
                else{
                    result.add(false); 
                }
           }     
         


            return result;
    }
}
