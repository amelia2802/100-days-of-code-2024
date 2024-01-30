/*Find the Duplicate Number
New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
Description
Write a function called 'findDuplicate' that takes an array of integers and returns the number that appears more than once in the array.
Rules
You must post your code in the code challenge channel
The array will always contain at least one number that appears more than once.
The array will never be empty.
The array can contain any positive or negative integer.
Example
findDuplicate([3,1,3,4,2]) => 3 */

import java.util.*;

public class duplicateElement {
    public static int findDuplicate(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int start = i+1;
            int end = n-1;
            int mid = start + (end - start)/2;
            while(start<=end){
                if(arr[mid] == arr[i]){
                    return arr[mid];
                }
                else if(arr[mid]>arr[i]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
                mid = start + (end - start)/2;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");

        int arrLen = sc.nextInt();
        int inputArr[] = new int[arrLen];
        System.out.println("Enter the array elements:");

        for(int i=0;i<arrLen;i++){
            inputArr[i] = sc.nextInt();
        }

        System.out.println(findDuplicate(inputArr,arrLen));
        sc.close();
    }
}
