package com.company;

public class EightAndNine {

    public static void main(String[] args) {
        /*9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
Write a program that will print out all matching pairs from arrays 1 and 2.
Expected output:
(7,7) and (6,6)*/
        int[] ar1 = {1, 7, 6, 5, 9, 5, 6};
        int[] ar2 = {2, 7, 6};

        for (int i = 0; i < ar2.length; i++) {
            if (ar1[i] == ar2[i]) {
                System.out.println("(" + ar1[i] + "," + ar2[i] + ")");
            }
        }

        /*8. Given the following array: ['w','t','y','h','k']
Loop through the array and replace the the letter 't' with the word "hello" once it's found.*/

        String[] letters = new String[5];
        letters[0] = "'w'";
        letters[1] = "'t'";
        letters[2] = "'y'";
        letters[3] = "'h'";
        letters[4] = "'k'";

        System.out.println("before swap");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i]=="'t'") {
                letters[i] = "'hello'";
            }
        }

        System.out.println();
        System.out.println("after swap");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }


    }

}
