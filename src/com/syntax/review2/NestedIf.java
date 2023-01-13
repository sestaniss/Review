package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        /* nested if is 1 is statement inside another if statement

        when we have 1 condition that depends on another
         */




        boolean vaccine =true;
        int dose =3;
        if(vaccine) { // outer if
            System.out.println("How any doses you have?");
            //inner if always depends on outer if
            if (dose==1){
                System.out.println("you need a second shot");
            }else {
                System.out.println("you are fully vacinated");
            }
        } else {
            System.out.println("I do not have a vaccine");
        }

    }
}
