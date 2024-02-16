/*
Longest Substring Without Repeating Characters
New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
Description
Given a string, find the length of the longest substring without repeating characters.
Rules
You must post your code in the code challenge channel
You may assume that the input string only contains lowercase English letters.
The length of the input string will not exceed 1,000.
Example
lengthOfLongestSubstring('abcabcbb') => 3
*/

import java.util.*;

class LongestSubstring{
    public static int lengthOfLongestSubstring(String str){
        if(str.length()<0 || str.length()>1000){
            return 0;
        }
        int lengthCount = 0, start =0, end = 0;
        
        Set<Character> modSet = new HashSet<Character>();
        
        while(end < str.length()){
            if(!modSet.contains(str.charAt(end))){
                modSet.add(str.charAt(end));
                lengthCount = Math.max(lengthCount, end - start + 1);
                end++;
            }
            else{
                modSet.remove(str.charAt(start));
                start++;
            }
        }

        return lengthCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputStr = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(inputStr));
        sc.close();
    }
}