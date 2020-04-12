/*
The Goal
Casablanca’s hippodrome is organizing a new type of horse racing: duals.
During a dual, only two horses will participate in the race.
In order for the race to be interesting, it is necessary to try to select two horses with similar strength.
Write a program which, using a given number of strengths, identifies the two closest strengths and shows their difference with an integer (≥ 0).

Author: Maciej Leciejewski
*/
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
        int N = in.nextInt();
        int[] pi = new int[N];
        int diff = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            pi[i] = in.nextInt();
        }
        Arrays.sort(pi);
        
        for (int i = 0; i < N-1; i++) {
            if (pi[i+1] - pi[i] < diff) {
                diff = pi[i+1] - pi[i];
            }         
        }
        System.out.println(diff);
    }
}
