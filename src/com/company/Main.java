package com.company;
import java.util.Scanner;
public class Main {
// BMI CALCULATOR BY @x1oto
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float res, weight, height;
    System.out.print("Enter your weight: ");
    weight = scan.nextFloat();
    System.out.print("Enter your height: ");
    height = scan.nextFloat();
    height /= 100;
    res = (weight / (height * 2));
    if (res < 18.5) {
        System.out.println("Your BMI is: " + res);
        System.out.println("You are underweight!");
    } else if (res < 25) {
        System.out.println("Your BMI is: " + res);
        System.out.println("You are normal!");
    } else if (res < 30) {
        System.out.println("Your BMI is: " + res);
        System.out.println("Your BMI is: " + res);
    } else {
        System.out.println("Your BMI is: " + res);
        System.out.println("You are obese!");
    }
    }
}
