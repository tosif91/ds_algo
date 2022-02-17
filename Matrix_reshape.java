// In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

// You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

// The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

// If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 

// Example 1:


// Input: mat = [[1,2],[3,4]], r = 1, c = 4
// Output: [[1,2,3,4]]
// Example 2:


// Input: mat = [[1,2],[3,4]], r = 2, c = 4
// Output: [[1,2],[3,4]]
 

// Constraints:

// m == mat.length
// n == mat[i].length
// 1 <= m, n <= 100
// -1000 <= mat[i][j] <= 1000
// 1 <= r, c <= 300


class Matrix_reshape {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if (mat.length * mat[0].length != r * c) 
            return mat;
        
        int[][] res = new int[r][c];
        int i = 0, j = 0;
        int col = mat[0].length-1;
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) {
                
                res[k][l] = mat[i][j];
                
                if (j < col) 
                    j++;
                else
                    i++;
                    j = 0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = new int[][] { new int[] { 1, 2 ,3}, new int[] { 3, 4 ,5} };
        int r = 3, c = 2;

        int[][] res = matrixReshape(mat, r, c);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}