/*
 *  Perfect Number Check
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. Your task is to create a function that checks if a given number is perfect.
    Rules
    You must post your code in the code challenge channel
    The function should return true if the number is perfect and false if it is not.
    The number will be a positive integer.
    Example
    perfectNumberCheck(6) => true
 */
import java.util.*;

public class perfectNumber {
    public static boolean perfectNumberCheck(int num){
        int sumFact = 1;

        if(num<0){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if (num % i == 0) {
                sumFact += i;
                if (i != num / i) {
                    sumFact += num / i;
                }
            }
        }

        return (num == sumFact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");

        int inputNumber = sc.nextInt();
        System.out.println(perfectNumberCheck(inputNumber));

        sc.close();
    }
}
