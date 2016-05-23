package src.finalproject;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        // Declaring variables
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        String name;
        String enteredGender;
        boolean gender;
        int age;
        int height;
        int feet;
        int inches;
        int weight;
        
        // Asking the user for information
        System.out.print("Enter your name: ");
        name = stringScanner.nextLine();
        
        System.out.print("Enter your gender (m/f): ");
        enteredGender = stringScanner.nextLine();
        
        if(enteredGender.toLowerCase().equals("m"))
        {
            gender = true;
        }
        else
        {
            gender = false;
        }
        
        System.out.print("Enter your age: ");
        age = intScanner.nextInt();
        
        System.out.print("Enter your height (inches): ");
        height = intScanner.nextInt();
        
        // Converts height from all inches to feet and inches
        feet = height / 12;
        inches = height % 12;
        
        System.out.print("Enter your weight (pounds): ");
        weight = intScanner.nextInt();
        
        System.out.println();
        
        // Creating and printing the profile based on what the user entered
        Profile profile = new Profile(name, gender, age, feet, inches, weight);
        System.out.print(profile);
    }
}