/*Check if All Characters are Unique
New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
Description
Write a method that checks if all the characters in a string are unique.
Rules
You must post your code in the code challenge channel
The input string will only contain lowercase letters.
The function should return true if all characters are unique and false otherwise.
Do not use any built-in or library methods. You must implement this functionality from scratch.
The time complexity of your solution should be O(n), where n is the length of the input string.
Example
areCharactersUnique('abcd') => true, areCharactersUnique('abcda') => false */

import java.util.*;

class uniqueCharacters{
    public static boolean areCharactersUnique(String word){
        if(word.length()==0){
            return true;
        }

        char splitedArr[] = word.toCharArray();
        Set<Character> setVal = new HashSet<Character>();
        for(char ch : splitedArr){
            if(setVal.contains(ch)){
                return false;
            }
            setVal.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");

        String inputStr = sc.nextLine();

        System.out.println(areCharactersUnique(inputStr));
        sc.close();
    }
}