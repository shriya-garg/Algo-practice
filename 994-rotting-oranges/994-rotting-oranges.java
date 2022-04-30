class Solution {
    // Used BFS
    public int orangesRotting(int[][] grid) {
        int total= 0;
        int updated = 0;
        int days = 0;
        int row = grid.length;
        int col = grid[0].length;
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}}; 
        
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]!=0){
                    total++;
                } if(grid[i][j]==2){
                    // rotten orange
                    updated++;
                    queue.add(new int[] {i,j});
                }
            }
        }
        
        while(!queue.isEmpty() && updated!=total){
            int size = queue.size();
            for(int p=0; p<size; p++){
                int[] temp = queue.poll();
                for(int k=3; k>=0; k--){
                    int tx = temp[0]+dir[k][0];
                    int ty = temp[1]+dir[k][1];
                    if(tx>=row || tx <0 || ty >=col || ty < 0 || grid[tx][ty]==0  || grid[tx][ty]==2) continue;
                    if(grid[tx][ty]==1){
                        grid[tx][ty]=2;
                        queue.add(new int[] {tx,ty});
                        updated++;
                    }
                }

            }
            days++;

            // System.out.println(Arrays.toString(grid[0]));
            // System.out.println(Arrays.toString(grid[1]));
            // System.out.println(Arrays.toString(grid[2]));
            // System.out.println("---" + days);
        }
            
        if(updated!=total){
            return -1;
        }
        return days;
        
        
        
    }
}