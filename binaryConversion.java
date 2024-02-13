/*Decimal to Binary Converter
New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
Description
Write a function that converts a decimal number to binary. The function will take an integer as an input and return a string as the output representing the binary equivalent of the input number.
Rules
You must post your code in the code challenge channel
The input number will be a positive integer
0 <= n <= 10^6
Example
decimalToBinary(10) => '1010
*/

import java.util.*;

public class binaryConversion {
    public static int decimalToBinary(int decimalNum){
        int binaryNum = 0;
        int index = 0;

        while(decimalNum!=0){
            int bit = decimalNum & 1;

            binaryNum = (bit * (int)(Math.pow(10,index))) + binaryNum;

            decimalNum = decimalNum >> 1;
            index++;
        }
        return binaryNum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number:");
        int inputNumber = sc.nextInt();

        System.out.println(decimalToBinary(inputNumber));
        sc.close();
    }    
}
