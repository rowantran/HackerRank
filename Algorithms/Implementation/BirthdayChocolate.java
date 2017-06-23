import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static int solve(int n, int[] s, int d, int m) {
        int count = 0;

        // Requires a larger piece of chocolate than the entire bar
        if (m > n) {
            return 0;
        }           

        for (int i = 0; i <= n - m; i++) {
            int pieceTotal = 0;
            for (int j = i; j < i + m; j++) {
                pieceTotal += s[j];
            }

            if (pieceTotal == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }

        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
