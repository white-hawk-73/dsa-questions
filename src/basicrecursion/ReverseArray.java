package basicrecursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array%n");
        int n = sc.nextInt();
        int[] ar = new int[n];

        System.out.printf("Enter %d elements of the array%n", n);
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        reverseArray(ar, 0, n - 1);
        
        System.out.printf("Array after reversal%n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", ar[i]);
        }
    }

    static void reverseArray(int[] ar, int beg, int end) {
        int temp;
        if (beg < end) {
            temp = ar[beg];
            ar[beg] = ar[end];
            ar[end] = temp;
            reverseArray(ar, beg + 1, end - 1);
        }
    }
}

