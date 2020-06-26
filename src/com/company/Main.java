package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Apples Time = new Apples();
        System.out.println(Time.toMilitary());
        System.out.println(Time.toString());

        Apples Time1 = new Apples(3,15,6);
        System.out.println(Time1.toMilitary());
        System.out.println(Time1.toString());


    }


}


//stuff we've covered so far'

/*
how to use
-basic introductions
-System.out
-Input from the user
-data types
-if else statements
-while loops
Introduced Multiple Classes
-manipulating multiple classes, takeaway, has to all be in the same folder for it to work well
-methods with parameters
-instance variables
-multiple methods within a class
-using a constructor
-nested if statements, don't really need practice on this
-else if
-conditional operators ... ? ... : ...
-implementing sth
-for loop
-compound interest calc.
-do while when you're looking for at least one run in your program
-useful functions in the math class
-random number gen
-arrays you only have one data type in java unlike lists
-array table
-summing all elements in an array
-creating an array that keeps tally
-enhanced for loop, similar to for in python
-arrays in methods
-multidimensional arrays
-variable length args ... means we don't know hoe many numbers, super important
-creating time functionality
-public, private, this | when you use this, think about this method
-overloaded constructors, code constructors being versatile enough to handle different scenarios







 */