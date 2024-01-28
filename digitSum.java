/*  Sum of Digits
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'sumOfDigits' that takes a non-negative integer as an argument and returns the sum of its digits.
    Rules
    You must post your code in the code challenge channel
    The input will only be non-negative integers.
    The function should return an integer.
    Example
    sumOfDigits(1234) => 10
*/

import java.util.*;

public class digitSum {
    public static int sumOfDigits(int num){
        int sum = 0;

        while(num!=0){
            sum+=(num % 10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int inputNumber = sc.nextInt();

        System.out.println(sumOfDigits(inputNumber));
        sc.close();
    }
}
