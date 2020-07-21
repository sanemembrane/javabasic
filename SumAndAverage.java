package com.busyqa.coursework.wk1_answer;

public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average  ; // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum

       
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     // same as "sum = sum + number"
        }
      average = sum / (upperbound - lowerbound);// Compute average in double. Beware that int/int produces int.
        System.out.println("The sum is:" + sum);// Print sum and average.
        System.out.println("The average is: " + average);
    }
}