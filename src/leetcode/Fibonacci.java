package leetcode;

import java.util.Scanner;

// 509. Fibonacci Number
public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
    static int fib(int n) {
        int beforePrevious;
        int previous;
        int curr = 0;
        if (n <= 1) {
            return n;
        } else {
            beforePrevious = 0;
            previous = 1;
            for (int i = 2; i <= n; i++) {
                curr = beforePrevious + previous;
                beforePrevious = previous;
                previous = curr;
            }
            return curr;
        }
    }
}
