/**
 * Locker Problem (Arrays)
 *
 * Write a program to simulate the following experiment. You have 100 closed lockers. Start with the first locker and
 * for every locker open it. Now, starting with the second locker, for this locker and every second locker after that,
 * if the locker is open, close it; if it is closed, open it. Then, starting with the third locker, for this locker and
 * every third locker after that, if the locker is open, close it; if it is closed, open it. Continue with the nth
 * locker changing the “position” of every nth locker until n = 100. Print out the locker numbers that remain open.
 * What do you notice about the lockers that remain open?
 */

package com.company;

public class arrayLockers2 {

    public static void main(String[] args) {
        // You have 100 closed lockers.
        // The default initial value of a boolean variable is 'false'
        boolean arr[] = new boolean[100];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += (i + 1)) {
                arr[j] = !arr[j];
            }
        }

        System.out.print("Here are the lockers that remain open: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}