/*  Multiples of a Number
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'multiples' that takes two integers 'n' and 'm' as arguments and returns an array of the first 'n' multiples of 'm'.
    Rules
    You must post your code in the code challenge channel
    The function should return an array of integers.
    Each number in the array should be a multiple of 'm'.
    The first number in the array should be 'm'.
    Example
    multiples(5, 3) => [3, 6, 9, 12, 15]
*/
import java.util.*;

public class multiplesOfNumber {
    public static int[] multiples(int n,int m){
        if(n<=0 || m==0){
            return new int[0];
        }
        int[] arr = new int[n];
        for(int i=1;i<n+1;i++){
            arr[i-1] = m * i;
        }

        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");

        int n = sc.nextInt();

        System.out.println("Enter the the number to calculate it's multiple:");
        int m = sc.nextInt();

        int resultArr[] = multiples(n,m);

        for (int i : resultArr) {
            System.out.print(i+" ");
        }
        
        sc.close();
    }
}
