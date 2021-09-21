/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String a1 = input.next();
        if (a1.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String a2 = input.next();
            if (a2.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            String a3 = input.next();
            if (a3.equals("y")) {
                System.out.println("Replace the battery.");
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                String a4 = input.next();
                if (a4.equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.print("Does the engine start and then die? ");
                    String a5 = input.next();
                    if (a5.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String a6 = input.next();
                        if (a6.equals("y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to make sure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
