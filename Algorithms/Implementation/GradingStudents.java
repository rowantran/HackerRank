// SOLVED

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static int nextMultipleOfFive(int n) {
        int multiple = 5;
        while (multiple < n) {
            multiple += 5;
        }
        
        return multiple;
    }

    static int[] solve(int[] grades) {
        int[] solution = new int[grades.length];
        for (int i = 0; i < solution.length; i++) {
            if (grades[i] < 38) {
                solution[i] = grades[i];
            } else {
                if (nextMultipleOfFive(grades[i]) - grades[i] < 3) {
                    solution[i] = nextMultipleOfFive(grades[i]);
                } else {
                    solution[i] = grades[i];
                }
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }

        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }

        System.out.println(""); 
    }
}

