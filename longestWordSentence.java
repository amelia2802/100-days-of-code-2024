/*  Find the Longest Word
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Given a sentence of words, return the longest word in the sentence.
    Rules
    You must post your code in the code challenge channel
    If there are two or more words that are the same length, return the first word from the sentence with that length.
    Ignore punctuation and assume sentence will not be empty.
    Example
    longestWord('The quick brown fox jumped over the lazy dog') => 'jumped'
 * 
 */

 import java.util.*;

 class longestWordSentence{
    public static String longestWord(String str){
        String newStr = str.replaceAll("[^\\w]"," ");
        String[] modStrArray = newStr.split(" ");
        String resultStr="";

        if(str.length()==1){
            return str;
        }

        for(int i=0;i<modStrArray.length;i++){
            if(modStrArray[i].length()>resultStr.length()){
                resultStr=modStrArray[i];
            }
        }
        return resultStr;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");

        String input_str = sc.nextLine();
        System.out.println(longestWord(input_str));
        sc.close();
    }
 }