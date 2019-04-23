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

        // initialize a new array
        String [] array = new String[5];

        // take user input
        Scanner keybd = new Scanner(System.in);
        for (String i : array){
            // populate array
            System.out.println("please enter a word");
            i = keybd.nextLine();

            //System.out.println("my word is " + array[i]);
            // we move the above statement outside of this for loop
            // because we don't want it to print every time it loops through
            // but just once at the end
        }

        // print using enhanced for loop
        for (String element : array){
            System.out.println("my word is " + element);
        }

    }
}
