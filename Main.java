package com.abdullahwins;

import java.awt.*;
import java.util.Date;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nPrimitive values:\n");

        //Memory management test of Primitive type!
        int x = 10;
        System.out.println("x=" + x);
        int y = x;
        x = 20;
        //Value of y remains same although value of x has been changed.
        System.out.println("y=" + y);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        System.out.println("\nReference values:\n");

        //Memory management test of Reference type!
        Point value = new Point(10, 20);
        System.out.println(value);
        Point newValue = new Point(value);
        //Any changes to the original value is being reflected to the reffered value.
        System.out.println(value);
        System.out.println(newValue);
        System.out.println(value);

        //Storing values in String!
        //Also this is Reference type, not Primitive type!
        String firstString = "\nHello Github" + ", ";
        String lastString = "I am learning to " + "code " + "using java!!";
        String myMessage = firstString + lastString;
        System.out.println(myMessage);
    }
}