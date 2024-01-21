/*Prime Number Check
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function that takes a number as an input and checks if it's a prime number or not. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    Rules
    You must post your code in the code challenge channel
    The function should only accept positive integers
    The function should return true if the number is a prime, and false if it is not
    The number 1 is not considered a prime number
    Example
    isPrime(5) => true
 */
import java.util.*;

public class checkPrime {

    public static boolean isPrime(int number){
        if(number<=0){
            return false;
        }
        if(number==1){
            return true;
        }
       for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
       }
       return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");

        int input_number = sc.nextInt();

        System.out.println(isPrime(input_number));
        sc.close();
    }
}
