/*Sorting Array in Ascending Order
New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
Description
Given an array of integers, write a function that sorts the array in ascending order.
Rules
You must post your code in the code challenge channel
Do not use built-in sort functions
The function should return the sorted array
Example
sortArray([5,3,8,1,2]) => [1,2,3,5,8] */

import java.util.*;

public class quickSort {

    public static int partition(int arr[],int s,int e){
        int pivot = arr[s];

        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }

        int pivotInd = s + count;
        int temp = arr[pivotInd];
        arr[pivotInd] = arr[s];
        arr[s] = temp;

        int i = s;
        int j =e;

        while(i< pivotInd && j > pivotInd){
            while (arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(i< pivotInd && j > pivotInd){
                int swapEle = arr[i];
                arr[i] = arr[j];
                arr[j] = swapEle;
                i++;
                j--;

            }
        }
        return pivotInd;
    }

    public static void sortArray(int arr[],int s,int e){
        if(s>=e){
            return;
        }

        int part = partition(arr,s,e);

        sortArray(arr, s, part-1);

        sortArray(arr, part+1, e);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int arrSize = sc.nextInt();

        int inputArr[] = new int[arrSize];

        System.out.println("Enter array elements:");
        for(int i=0;i<arrSize;i++){
            inputArr[i] = sc.nextInt();
        }

        sortArray(inputArr,0,arrSize-1);

        for(int i=0;i<arrSize;i++){
            System.out.print(inputArr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}
