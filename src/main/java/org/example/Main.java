//package location of the file
package org.example;

import java.util.Scanner;

//Class
public class Main {
    //Main method of the class
    public static void main(String[] args) {

        //outputs the text in the console
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);

        //variable name to storing the name entered
        String name = scanner.nextLine();

        //outputs the text in the console
        System.out.println("Hi " + name + ',' + "please enter your favorite hobby!");

        //variable hobby to storing the hobby entered
        String hobby = scanner.nextLine();

        //outputs the text in the console
        System.out.println("Your favorite hobby is " + hobby + '.');
    }
}