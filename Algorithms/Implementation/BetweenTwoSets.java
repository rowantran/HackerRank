import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static int getTotalX(int[] a, int[] b) {
        int count = 0;

        for (int i = 1; i <= max(b); i++) {
           if (betweenAB(i, a, b)) {
               count += 1;
           }
        }

        return count;
    }

    static boolean betweenAB(int x, int[] a, int[] b) {
        for (int n : a) {
            if (x % n != 0) {
                return false;
            }
        }

        for (int n : b) {
            if (n % x != 0) {
                return false;
            }
        }

        return true;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int n : arr) {
            if (n > maxVal) {
                maxVal = n;
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }

        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
