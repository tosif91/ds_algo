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