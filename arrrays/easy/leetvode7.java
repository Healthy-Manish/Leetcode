package arrrays.easy;
/*
 * Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
 */
public class leetvode7 {
    
        public int diagonalSum(int[][] mat) {
            int sum  = 0;
            
            for (int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                if(i==j){
                    sum = sum+mat[i][j];
                    mat[i][j]=0;
                }
                
                if(j==mat.length-i-1){
                   
              
                    sum = sum+mat[i][j];
                }
                }
            }
            
            return sum;
    }
    }

