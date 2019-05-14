/**
 * Created by yamahachou on 2018/11/6.
 */
public class The_longest_increasing_path_in_Matrix {

    public static int helper(int[][] matrix, int i, int j, int record, int val, boolean[][] visited){

        if(i<0||i>=matrix.length||j<0||j>=matrix[0].length){
            return record;
        }
        if(Math.abs(matrix[i][j] - val)<=3){
            return record;
        }
        if(visited[i][j] == true){
            return record;
        }

        //record++;

        visited[i][j] = true;

        int up = helper(matrix, i - 1, j, record+1, matrix[i][j], visited);
        int down = helper(matrix, i + 1, j, record+1, matrix[i][j], visited);
        int right = helper(matrix, i, j + 1, record+1, matrix[i][j], visited);
        int left = helper(matrix, i, j - 1, record+1, matrix[i][j], visited);
        int upright = helper(matrix, i - 1, j+1, record+1, matrix[i][j], visited);
        int upleft = helper(matrix, i - 1, j - 1, record+1, matrix[i][j], visited);
        int downright = helper(matrix, i+1, j + 1, record+1, matrix[i][j], visited);
        int downleft = helper(matrix, i+1, j - 1, record+1, matrix[i][j], visited);

        visited[i][j] = false;

        int max1 = Math.max(Math.max(up, down), Math.max(right, left));
        int max2 = Math.max(Math.max(upright, upleft), Math.max(downright, downleft));
        int max = Math.max(max1, max2);
        return max;
        }



    public static int longestIncreasingPath(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int[][] cache = new int[matrix.length][matrix[0].length];
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                int max = helper(matrix, i, j, 0, Integer.MIN_VALUE,  visited);
                res = Math.max(res, max);
            }
        }
        return res;

    }


    public static void main(String[] avg){

        int[][] matrix = {{1,5,8}};
        int[][] cache = new int[matrix.length][matrix[0].length];
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int res = longestIncreasingPath(matrix);
        System.out.println(res);


    }
}
