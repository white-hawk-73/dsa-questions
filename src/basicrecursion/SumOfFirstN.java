package basicrecursion;

import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.printf("The sum of first %d numbers is %d", n, sum(n));
    }

    static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }
}
