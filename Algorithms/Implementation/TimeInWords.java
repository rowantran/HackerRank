import java.io.*;
import java.util.*;

public class Solution {

    public static final String[] NUMBER_NAMES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        if (m == 0) {
            return NUMBER_NAMES[h] + " o' clock";
        } else {
            int minutesToClosestHour = m;
            boolean closestToNextHour = false;

            if (m > 30) {
                minutesToClosestHour = 60 - m;
                closestToNextHour = true;
            }

            String minutesWords;
            if (minutesToClosestHour == 1) {
                minutesWords = NUMBER_NAMES[minutesToClosestHour] + " minute";
            } else if (minutesToClosestHour == 15 || minutesToClosestHour == 30) {
                minutesWords = NUMBER_NAMES[minutesToClosestHour];
            } else {
                minutesWords = NUMBER_NAMES[minutesToClosestHour] + " minutes";
            }

            if (closestToNextHour) {
                if (h == 12) {
                    return minutesWords + " to " + NUMBER_NAMES[1];
                } else {
                    return minutesWords + " to " + NUMBER_NAMES[h+1];
                }
            } else {
                return minutesWords + " past " + NUMBER_NAMES[h];
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
