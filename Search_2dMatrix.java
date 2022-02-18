import java.util.Scanner;

public class Search_2dMatrix {
    
    
    public static  boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while(true){
             if(target == matrix[i][j]){
                return true;
            }
            else if (target < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
            
            if(i >= matrix.length || j < 0)
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int  target = 60;

        boolean res =searchMatrix(matrix, target);
        System.out.println(res);

    }
}
