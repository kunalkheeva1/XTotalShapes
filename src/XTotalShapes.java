public class XTotalShapes {



   static void dfs(int i, int j, int n, int m, int grid[][]){

        if(i<0 ||j<0 || i==n || j==m){
            return;
        }

        if(grid[i][j]== 'O'){
            return;
        }

        grid[i][j] ='O';

        dfs(i+1,j, n, m, grid);
        dfs(i-1,j, n, m, grid);
        dfs(i,j+1, n, m, grid);
        dfs(i,j-1, n, m, grid);

    }


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
        }return count;
    }


    public static void main(String[] args) {

    }
}
