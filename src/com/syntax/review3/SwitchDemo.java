package com.syntax.review3;

public class SwitchDemo {
    public static void main(String[] args) {

        /*
        World Cup:
        and provide winners
         */

        int worldCup=2022;

        switch (worldCup){
            default:
                System.out.println("Winner is unknown");
            case 2022:
                System.out.println("Winner is Messi");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;




        }
    }

}
