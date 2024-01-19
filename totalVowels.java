/*  Count Vowels in a String
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'countVowels' that takes a string as an argument and returns the count of all vowels in that string.
    Rules
    You must post your code in the code challenge channel
    The input string may contain both lowercase and uppercase letters.
    The vowels are 'a', 'e', 'i', 'o', 'u'.
    Example
    countVowels('Hello World') => 3
 * 
 */

import java.util.*;

class totalVowels {
    public static int countVowels(String str){
        if(str.length()==0){
            return 0;
        }
        char[] modCharArray = str.replaceAll("\\s","").toLowerCase().toCharArray();
        int countV = 0;
        for(char ch : modCharArray){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countV++;
            }
        }
        return countV;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");

        String input_String = sc.nextLine();

        System.out.println(countVowels(input_String));
        sc.close();
    }
}
