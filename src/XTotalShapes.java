public class XTotalShapes {



   static void dfs(int i, int j, int n, int m, int grid[][]){


       //if i or j gets out of the grid then simply return
        if(i<0 ||j<0 || i==n || j==m){
            return;
        }
        //or if finds 0 then return as well
        if(grid[i][j]== 'O'){
            return;
        }
        //otherwise just update the grid numbers with 0, to act like wall,
       // so that it does not come back for searching
        grid[i][j] ='O';

        //otherwise call other options, up, down, right, left
        dfs(i+1,j, n, m, grid);
        dfs(i-1,j, n, m, grid);
        dfs(i,j+1, n, m, grid);
        dfs(i,j-1, n, m, grid);

    }

        //return the count of shapes in the grid formed by X
    static int xTotalShapes(int [][]grid ){
       //n no. of rows, m no. of columns
        int n = grid.length;
        int m = grid[0].length;
        int count =0;

        //increment the count wherever it finds X, and call dfs for other elements
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
