int tx = temp[0]+dir[k][0];
int ty = temp[1]+dir[k][1];
if(tx>=row || tx <0 || ty >=col || ty < 0 || grid[tx][ty]==0  || grid[tx][ty]==2) continue;
if(grid[tx][ty]==1){
grid[tx][ty]=2;
queue.add(new int[] {tx,ty});
updated++;
}
}
​
}
days++;
​
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