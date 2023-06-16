package basicrecursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to print");
        String name = sc.next();
        System.out.println("Enter how many times you want to print the name");
        int n = sc.nextInt();

        printName(name, n);
    }

    static void printName(String name, int n) {
        if (n > 0) {
            System.out.println(name);
            printName(name, n - 1);
        }
    }
}
