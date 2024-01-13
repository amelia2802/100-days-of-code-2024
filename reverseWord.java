/*
 *  Reverse Words in a String
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
    Rules
    You must post your code in the code challenge channel
    The input string can be of any length.
    The input string can contain any printable ASCII character.
    Words are separated by one or more spaces.
    Your function should not remove any spaces.
    Example
    reverseWords('The quick brown fox') => 'ehT kciuq nworb xof'
 */

import java.util.*;

class reverseWord {
    public static String reverseWords(String str){
        String[] modStrArray = str.split(" ");
        for(int i=0;i<modStrArray.length;i++){
            StringBuilder reversedString = new StringBuilder();
            reversedString.append(modStrArray[i]);
            modStrArray[i] = reversedString.reverse().toString();
        }
        String output_str = String.join(" ", modStrArray);
        return output_str;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence or word:");

        String input_str = sc.nextLine();
        System.out.println(reverseWords(input_str));

        sc.close();
    }
}
