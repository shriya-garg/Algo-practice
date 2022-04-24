class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = findRow(matrix, target);
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);
        return isPresent(matrix, row, target, 0, matrix[0].length-1);
    }
    
    private int findRow(int[][] matrix, int target){
        
        for(int r=0; r<matrix.length-1; r++){
            if(target>=matrix[r][0] && target<matrix[r+1][0]){
                return r;
            }
        }
        return matrix.length-1;
    }
    
    private boolean isPresent(int[][] matrix, int r, int target, int lo, int hi){
        // int col = matrix[0].length;
        int mid = (lo+hi)/2;
        // System.out.println(mid);
        // System.out.println(matrix[r][mid]);
        if (matrix[r][mid]==target){
            return true;
        }
        while(lo<hi){
            if(target<matrix[r][mid]){
                return isPresent(matrix, r, target, lo, mid-1);
            }else{
                return isPresent(matrix, r, target, mid+1, hi);
            }
        }
           return false; 
    }
}