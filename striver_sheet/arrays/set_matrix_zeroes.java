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

//APPROACH 2 : USING two dummy arrays of size row and column 

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