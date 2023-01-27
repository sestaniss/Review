package com.syntax.review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        //let`s create an array of names using Scanner

        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to store");
        int size=scan.nextInt();
        String[]names=new String[size];
        //this loop stores elements inside the array
        //regular for loop work with indexes
        for (int i=0; i< names.length; i++) {
            System.out.println("Please enter name");
            names[i]=scan.next();
        }
        //using loop below we can retrieve elements
        //enhanced for loop work with variable

        for (String n:names){
            System.out.println(n);
        }
    }
}
