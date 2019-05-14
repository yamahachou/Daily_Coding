/**
 * Created by yamahachou on 2018/11/22.
 */
public class Number_of_Islands {

    private static void dfs(char[][] grid, int r, int c){
        int rl = grid.length;
        int cl = grid[0].length;

        if(r < 0 || c < 0 || r >= rl || c >= cl || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands(char[][] grid){

        int num_island = 0;

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    num_island++;
                    dfs(grid, i, j);
                }
            }
        }

        return num_island;
    }

    public static void main(String[] avg){
        char[][] grid = {
                         {'1','1','0','0','0'},
                         {'1','1','0','0','0'},
                         {'0','0','1','0','0'},
                         {'0','0','0','1','1'}
                         };

        System.out.println(numIslands(grid));

    }

}
