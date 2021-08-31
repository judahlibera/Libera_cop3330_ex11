/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("How many euros are you exchanging? ");
        int e = sc.nextInt();
        System.out.printf("What is the exchange rate? ");
        double r = sc.nextDouble();
        System.out.printf("%d euros at an exchange rate of %f is\n" +
                "%.2f U.S. dollars.", e, r, (double)(e*r));
    }
}