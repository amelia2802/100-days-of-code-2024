/*  Fibonacci Sequence
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Given a number n, print the n-th Fibonacci Number.
    Rules
    You must post your code in the code challenge channel
    The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
    For the purpose of this problem, assume that the first two Fibonacci numbers are 0 and 1.
    Your function should return -1 if the input is less than 0.
    Example
    fibonacci(5) => 5 
*/

import java.util.*;

public class nthFibonacci {
    public static int fibonacci(int num){
        if(num<0){
            return -1;
        }

        if(num<=1){
            return num;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int inputNumber = sc.nextInt();

        System.out.println(inputNumber +"th fibonacci is: "+fibonacci(inputNumber));
        sc.close();
    }
}
