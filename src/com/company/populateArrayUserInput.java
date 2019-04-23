package com.company;

import java.util.Scanner;

public class populateArrayUserInput {

    public static void main(String[] args) {
        // one way to initialize
        int[] ar = new int[5];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        ar[4]=5;

        // another way to initialize
        int[] ar2 = {10, 20, 30, 40, 50};

        for (int i=0; i<ar2.length; i++){
            System.out.println(ar2[i]);
        }

        /*
        * populate array with user input
        * */
        // initialize a new array
        String [] array = new String[5];

        // take user input
        Scanner keybd = new Scanner(System.in);
        for (String i : array){

            // populate array
            System.out.println("please enter a word");
            i = keybd.nextLine();

            System.out.println("my word is " + i);

        }

        // print using enhanced for loop
        for (int i = 0; i < array.length; i++){
            System.out.println("my word is " + array[i]);
        }

    }
}
