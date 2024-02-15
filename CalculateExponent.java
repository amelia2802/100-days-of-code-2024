/*
Calculate Exponent of a Number
New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
Description
Write a function called 'calculateExponent' that takes two integers as arguments, a base and an exponent, and returns the result of base raised to the power of the exponent.
Rules
You must post your code in the code challenge channel
The base is an integer between 1 and 100 inclusive.
The exponent is an integer between 0 and 10 inclusive.
Do not use the built-in power function or operator in your solution.
Example
calculateExponent(2, 3) => 8

*/
import java.util.*;

public class CalculateExponent {
    public static int calculateExponent(int base,int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * calculateExponent(base, exponent-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();

        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();

        System.out.println(calculateExponent(base,exponent));
        sc.close();
    }
}
