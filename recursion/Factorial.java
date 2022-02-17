package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
