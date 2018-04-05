import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        in.nextLine();
        int h = in.nextInt();
        in.nextLine();
        String t = in.nextLine().toUpperCase();
        for (int i = 0; i < h; i++) {
            String row = in.nextLine();
            for (int j = 0; j < t.length(); ++j) {
                int p = t.charAt(j) - 'A';
                if (p < 0 || p >= 26) {
                    p = 26;
                }
                System.out.print(row.substring(l * p, l * (p + 1)));
            }
            System.out.println();
        }
    }
}
