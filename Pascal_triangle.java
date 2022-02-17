import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle {
    public static List<List<Integer>> generate(int n) {

        List<List<Integer>> totalRows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }

            totalRows.add(new ArrayList<>(row));
        }

        return totalRows;

        // BELOW IS SOLUTION WITH EXTRA SPACE
        
        // List<List<Integer>> res = new ArrayList<>();
        // int[][] ar = new int[n][n];
        // for(int i = 0 ;i < n ; i++){
        // for(int j = 0;j< i+1;j++){
        // if(j == 0 || i == 0){
        // ar[i][j] = 1;
        // }else{
        // ar[i][j] = ar[i-1][j-1] + ar[i-1][j];
        // }
        // }
        // }
        // for(int i= 0 ;i<n;i++){
        // res.add(i,new ArrayList<>());
        // for(int j=0;j<n;j++){
        // if(ar[i][j] != 0 ){
        // res.get(i).add(ar[i][j]);
        // }
        // }
        // }
        // return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = generate(4);
        for (List<Integer> val : res) {
            for (int item : val) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
