/*
 * Sum of Array Elements
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function named 'sumOfElements' that accepts an array of numbers as an argument and returns the sum of all the numbers in the array.
    Rules
    You must post your code in the code challenge channel
    If the array is empty, return 0.
    Example
    sumOfElements([1, 2, 3, 4, 5]) => 15
 */

import java.util.*;

class sumNum {

    public static int sumOfElements(int[] arr,int n){
        if(n==0){
            return 0;
        }

        return arr[n-1] + sumOfElements(arr, n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int arrSize = sc.nextInt();

        int inputArr[] = new int[arrSize];

        System.out.println("Enter the array elements:");
        for(int i=0;i<arrSize;i++){
            inputArr[i]=sc.nextInt();
        }

        System.out.println(sumOfElements(inputArr,arrSize));
        sc.close();
    }
}
