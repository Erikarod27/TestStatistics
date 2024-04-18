package com.pluralsight;

import java.util.Scanner;

public class TestStatisticsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float scores[] = new float[10];
        float highestScore = 0;
        float lowestScore = 100;
        float average = 0;
        float median = 0;

        //add 10 test scores
        for (int i = 0; i < scores.length; i++) {
            int test = i + 1;
            System.out.printf("Test score %d: ", test);
            scores[i] = scanner.nextInt();
        }

        //add all scores to get average
        for (float score : scores) {
            average += score;
        }
        average /= 10;

        //check for highest score
        for (float score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }

        //check for lowest score
        for (float score : scores) {
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        //checks for median
        median = (scores[4] + scores[5]) /2;

        //print average, highest, lowest, and median score
        System.out.printf("Average Score: %.2f", average);
        System.out.printf("\nHighest Score: %.2f", highestScore);
        System.out.printf("\nLowest Score: %.2f", lowestScore);
        System.out.printf("\nMedian: %.2f", median);
    }
}
