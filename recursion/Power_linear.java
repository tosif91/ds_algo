package recursion;

import java.util.Scanner;

public class Power_linear {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = powerLog(x, n);
        System.out.println(res);
    }

    public static int powerLog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpb = powerLog(x, n / 2);
        int pb = xpb * xpb;
        if (n % 2 != 0) {
            pb *= x;
        }
        return pb;

    }

    public static int powerLinear(int x, int n) {

        if (n == 0) {
            return 1;
        }
        return x * powerLinear(x, n - 1);
    }
}
