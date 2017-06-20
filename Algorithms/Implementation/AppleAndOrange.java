// SOLVED

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }

        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        int applesInRange = 0;
        for (int i : apple) {
            int location = a + i;
            if (location >= s && location <= t) {
                applesInRange += 1;
            }
        }

        int orangesInRange = 0;
        for (int i : orange) {
            int location = b + i;
            if (location >= s && location <= t) {
                orangesInRange += 1;
            }
        }

        System.out.println(applesInRange);
        System.out.println(orangesInRange);
    }
}
