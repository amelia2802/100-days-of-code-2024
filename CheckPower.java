/*  Check if a Number is a Power of Two
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function that checks whether a given integer is a power of two.
    Rules
    You must post your code in the code challenge channel
    The function should return true if the number is a power of two, and false otherwise.
    You may not use any built-in power functions or logarithms in your solution.
    The input will always be a positive integer.
    Example
    isPowerOfTwo(4) => true, isPowerOfTwo(6) => false
 * 
 */
import java.util.*;

class CheckPower {
    public static boolean isPowerOfTwo(int number){
        if(number <= 0){
            return false;
        }
       if((number & (number - 1)) == 0){
        return true;
       }
       return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int input_number = sc.nextInt();
        System.out.println(isPowerOfTwo(input_number));

        sc.close();
    }
}
