/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedLoop;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
      

        System.out.println("Program 1");
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println("Program 2");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");

            }
            System.out.println("");
        }

        System.out.println("program 3");
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Program 4");

        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= j; i++) {

                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("program 5");
        for (int j = 5; j > 0; j--) {

            for (int i = 1; i <= j; i++) {

                System.out.print("*");
            }
            System.out.println("");

        }
        System.out.println("program 6");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
        System.out.println("program 7");
        for (int i = 5; i > 0; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
        System.out.println("program 8");
        System.out.println("Enter Any number");
        int row = scan.nextInt();
        
        int i, j;
        for (i = 0; i <= row - 1; i++) {

            for (j = 0; j <= i; j++) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = row - 1; i > 0; i--) {
            for (j = 0; j < i - 1; j++) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

       

    }

}
