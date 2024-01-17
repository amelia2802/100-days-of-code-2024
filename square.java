/*
 *  Square Root of an Integer
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Given an integer x, calculate the square root of x and return the integer part. If the result is a decimal, truncate the decimal part and return the integer part only.
    Rules
    You must post your code in the code challenge channel
    Do not use any built-in square root function.
    The time complexity should be less than O(n).
    Example
    squareRoot(8) => 2
 */

import java.util.*;

class square{
    public static int squareRoot(int number){
        if(number==0 || number==1){
            return number;
        }
        int left = 1;
        int right = number;
        int result = 0;

        int mid = left + (right - left) / 2;

        while (left <= right) {
            if(mid <= number/mid){
                left = mid+1;
                result = mid;
            }
            else{
                right = mid-1;
            }
            mid = left + (right - left) / 2;
        }
        return result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number:");

        int input_number = sc.nextInt();

        System.out.println(squareRoot(input_number));
        sc.close();
    }
}