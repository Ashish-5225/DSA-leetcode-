class Solution {
      boolean Search (int[][] matrix, int target ,int row){
         int n = matrix[0].length;
         int st=0;
         int en=n-1;
         while (st<=en){
            
            int mid = st +(en-st)/2;
            if(target==matrix[row][mid]){
                return true;
            }else if (target>matrix[row][mid]){
              st = mid+1;
            }else {
                en=mid-1;
         }
      }
      return false;
      }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int strtrow=0 ; int endrow=m-1;
         while(strtrow<=endrow){
            int midrow=strtrow+(endrow-strtrow)/2 ;
            if (target>=matrix[midrow][0]&&target<=matrix[midrow][n-1]){
                return Search (matrix , target, midrow);
            }else if(target>=matrix[midrow][n-1]){
                strtrow=midrow+1;
            }else {
                endrow=midrow-1;
            }
         }
    return false;
    }
}