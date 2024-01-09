/**
 *  Valid Palindrome | Code Challenge
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Rules
    You must post your code in the code challenge channel
    Example
    isPalindrome('A man, a plan, a canal: Panama') => true
 */

import java.util.*;

public class Palindrome {

    public static boolean checkPalindrome(String str){
        String newStr = (str.toLowerCase()).replaceAll("[^\\w]","");  //convert the string into lower case ommit the special characters and whitespaces
        char[] strArr = newStr.toCharArray(); //convert the new string into character array to check palindrome
        
        int i=0; //start index
        int j = strArr.length-1; //end index

        //run a loop to check the string in palindrome or not
        while(i<=j){
            if(strArr[i]!=strArr[j]){ //if not equal return false and end the loop
                return false;
            }
            else{   //continue the loop
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string to check:");
        String inputString = sc.nextLine(); //store input string
        System.out.println(checkPalindrome(inputString)); //print the output
        sc.close();
    }    
}
