public class XTotalShapes {

    static int xTotalShapes(int [][]grid ){
        int n = grid.length;
        int m = grid[0].length;
        int count =0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                count ++;
                if(grid[i][j]=='X'){
                    dfs(i,j, n, m, grid);
                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
