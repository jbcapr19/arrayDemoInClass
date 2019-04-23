package com.company;

import java.util.Scanner;

public class findLengthTheHardWay {
    public static void main(String[] args) {
        // find the length of the word without using length function

        String[] wordList = new String[3];

        for (String s : wordList){

            // take user input for word
            String word = "";
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a word: ");
            word = input.nextLine();

            // count the length of word
            // break down the word into smaller chunks
            // save that into an array
            String[] wordSplit = word.split("");
            int counter = 0;
            // any work with array means using for-loop
            for (String ws : wordSplit) {
                // if the element in array is not null,
                // keep count and increment
                if (ws != null){
                    counter = counter + 1;
                }
            }
            System.out.println("The length of the word is " + counter);
        }

    }
}
