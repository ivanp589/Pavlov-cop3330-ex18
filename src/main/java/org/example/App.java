package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
        App math = new App();
        App ask = new App();
        int type = ask.conversiont();
        ask.temperature(type);
    }
    private int conversiont(){
        out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        String input = in.next();

            if (input.equals("C") | input.equals("c")) return 1;
            else if (input.equals("f") | input.equals("F")) return 2;
            else return conversiont();

    }
    private double temperature(int type){
        if(type == 1){
            out.print("Please enter the temperature in Fahrenheit: ");
            int tmp= in.nextInt();
            double c= (double) (tmp-32)*5.0/9.0;
            out.println(String.format("The temperature in Celsius is %.2f",c));
            return c;
        }
        else if(type == 2){
            out.print("Please enter the temperature in Celsius: ");
            int tmp =in.nextInt();
            double f = (double) (tmp*(9.0/5.0))+32;
            out.println(String.format("The temperature in Fahrenheit is %.2f",f));
            return f;
        }
    return-273;}
}
