package basicrecursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        print(n);
    }

    static void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.println(n);
        }
    }
}
