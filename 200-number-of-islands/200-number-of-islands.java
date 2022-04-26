class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        boolean[][] visited = new boolean[row][col];
        for(int i=0; i < row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1' && visited[i][j] == false){
                    drawTree(grid, i, j, visited);
                    // System.out.println("here");
                    count++;
                }
            }
        }
        return count;
    }
    
    public void drawTree(char[][] grid, int r, int c, boolean[][] visited){
        if(r<0 || c<0 || r==grid.length || c==grid[0].length || visited[r][c]==true || grid[r][c]=='0'){
            return;
        }
        // System.out.println("r="+r +"; c="+c);
        visited[r][c] = true;
        drawTree(grid, r-1, c, visited);
        drawTree(grid, r, c+1, visited);
        drawTree(grid, r+1, c, visited);
        drawTree(grid, r, c-1, visited);    
    }
}