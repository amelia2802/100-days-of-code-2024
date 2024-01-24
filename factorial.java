/*  Factorial of a Number
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'calculateFactorial' that takes a positive integer 'n' as an argument and returns the factorial of 'n'.
    Rules
    You must post your code in the code challenge channel
    The factorial of 'n' is the product of all positive integers less than or equal to 'n'.
    The factorial of 0 is 1.
    The input 'n' will always be a positive integer.
    Example
    calculateFactorial(5) => 120

 * 
 */

import java.util.*;

public class factorial {
    public static int calculateFactorial(int num){
        if(num==0){
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int inputNumber = sc.nextInt();

        System.out.println(calculateFactorial(inputNumber));
        sc.close();
    }
}
