// 73. Set Matrix Zeroes
// Medium

// 7641

// 504

// Add to List

// Share
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

// Constraints:

// m == matrix.length
// n == matrix[0].length
// 1 <= m, n <= 200
// -231 <= matrix[i][j] <= 231 - 1
 


// APPROACH 1 : BRUTEFORCE SOLUTION (  NOTE THIS BRUTEFORCE SOLUTION WILL ONLY WORK WHEN RANGE OF ELEMENTS IS POSITIVE )
class Solution {
    public void setZeroes(int[][] matrix) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<totalCols;j++){
                if(matrix[i][j] == 0){
                    updateRowandCol(matrix,i,j,totalRows,totalCols);
                }
            }
        }
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<totalCols;j++){
                if(matrix[i][j] == -1)   
                    matrix[i][j] = 0;
            }
        }
    }
    public void updateRowandCol(int[][] matrix , int i,int j,int totalRows,int totalCols){
            //this function will update my rows and cols to -1
            //updating row element
            for(int k=0;k< totalCols;k++){
                if(matrix[i][k] != 0)
                    matrix[i][k] = -1;
            }
            //updating col element
            for(int k=0;k<totalRows;k++){
                if(matrix[k][j] != 0)
                    matrix[k][j]=-1;
            }    
        } 
       
    }

//APPROACH 2 : USING two dummy arrays of size row and column {uses n+m extra space}

class Solution1 {
    public void setZeroes(int[][] matrix) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        int[] colArray = new int[totalCols];
        int[] rowArray = new int[totalRows];
        
        
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<totalCols;j++){
                if(matrix[i][j] == 0){
                    //update col and row array as well 
                    colArray[j] = -1;
                    rowArray[i] = -1;
                }
            }
        }
        
        //retraverse to set the values equals to zero 
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<totalCols;j++){
                if(rowArray[i] == -1 || colArray[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}

// APPROACH 3 : INPLACE OF CREATING DUMMY ARRAYS USE 0th row and 0th columsn as dummy varaible , which will reduce extra space 

// THIS IS MOST OPTIMAL APPROACH



class Solution2 {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean row=false,col=false;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                row=true;
            }
        }
        for(int j=0;j<m;j++){
            if(matrix[j][0]==0){
                col=true;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
     
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        if(row){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(col){
            for(int j=0;j<m;j++){
                matrix[j][0]=0;
            }
        }
        
        
    }
}
