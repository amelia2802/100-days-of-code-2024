/*
 * Find Missing Number in Array
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'findMissing' that takes an array of n distinct numbers taken from 0, 1, 2, ..., n. The function should return the missing number.
    Rules
    You must post your code in the code challenge channel
    The input array is guaranteed to have at least two elements.
    The function should return the missing number.
    Example
    findMissing([3, 0, 1]) => 2
 */
import java.util.*;

public class missingNumber {
    public static int findMissing(int[] arr,int n){
        Arrays.sort(arr);
        
        int start = 0;
        int end = n-1;

        int mid = start + (end - start)/2;

        while (start<=end) {
            if(arr[mid] == mid){
                start = mid +1;
            }
            else if(arr[mid] > mid){
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
        return start;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");

        int arrLength = sc.nextInt();

        int inputArr[] = new int[arrLength];

        System.out.println("Enter array elements:");
        for(int i=0;i<arrLength;i++){
            inputArr[i] = sc.nextInt();
        }

        System.out.println(findMissing(inputArr,arrLength));
        sc.close();
    }
}
