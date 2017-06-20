// SOLVED

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // One kangaroo starts ahead of the other and has higher
        // velocity, i.e. second kangaroo will never catch up
        if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)) {
            return "NO";
        }

        boolean firstKangarooFaster;
        if (v1 > v2) {
            firstKangarooFaster = true;
        } else if (v2 > v1) {
            firstKangarooFaster = false;
        } else {
            if (x1 == x2) {
                return "YES";
            } else {
                return "NO";
            }
        }

        while (true) {
            x1 += v1;
            x2 += v2;

            if (x1 == x2) {
                return "YES";
            }

            if ((firstKangarooFaster && x1 > x2) || (!firstKangarooFaster && x2 > x1)) {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

