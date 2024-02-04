/*  Even or Odd Number Checker
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'evenOrOdd' that takes a number as an argument and returns a string indicating whether the number is even or odd.
    Rules
    You must post your code in the code challenge channel
    If the number is even, the function should return 'Even'.
    If the number is odd, the function should return 'Odd'.
    If the input is not a number, the function should return 'Invalid input'.
    Example
    evenOrOdd(4) => 'Even', evenOrOdd(7) => 'Odd', evenOrOdd('hello') => 'Invalid input' 
*/
import java.util.*;

public class evenOdd {
    public static String evenOrOdd(int num) {
        try {
            if (num % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        } catch (InputMismatchException e) {
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input:");
        
        try {
            int inputNumber = sc.nextInt();
            System.out.println(evenOrOdd(inputNumber));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}

