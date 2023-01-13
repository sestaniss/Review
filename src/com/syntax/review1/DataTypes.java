package com.syntax.review1;

public class DataTypes {
    public static void main(String[] args) {

        /* Data Types in Java: 1. primitive and 2. non primitive

        Primitive data types 8: byte, short, float, int, long, double, boolean, char
        numeric:
         whole number: byte, short, int, long
         decimal numbers: float, double

         boolean: true or false
         char: single character
              */
        // dataType nameofTheVariable = value;

       // dataTypes for whole values
        byte num1=127;
        short numb1=10;
        int num2=1000; // most used
        long num3=1000000;

        //dataTypes for decimal
        float number=10.99f;
        double number2=100.89;

        //dataType to represent single character
        char money='$';
        char gender='m';

         //datatype to represent yes or no
        boolean needBreak=true;
        boolean understandingJava=true;

        System.out.println(num1); //printing value inside variable num1=10
        System.out.println("num1"); // printing a String value=num1

        //create variable and store value into it
        boolean hungry=false;
          //hungry="yes"; error
        System.out.println(hungry);

        //String is the most popular datatype
        String myString="Hello";
        String name="Sam";
        String address="123 Test Drive";

        // Hello Sam
        System.out.println(myString+" "+name);

        int age=21;

        //Sam is 21 years old

        System.out.println(name+" is "+age+" years old");







    }
}
