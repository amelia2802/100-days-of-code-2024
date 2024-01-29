/*  Count Occurrences
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'countOccurrences' that takes a string and a target character as arguments. The function should return the number of times the target character appears in the string.
    Rules
    You must post your code in the code challenge channel
    The function should be case-sensitive. For instance, 'A' and 'a' are considered different characters.
    The function should have a time complexity of O(n), where n is the length of the string.
    Example
    countOccurrences('Hello World', 'o') => 2 
*/
import java.util.*;

public class characterOccurence {

    public static int countOccurrences(String str, char ch){
        int countOccurrence = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                countOccurrence++;
            }
        }

        return countOccurrence;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");

        String inputStr = sc.nextLine();

        System.out.println("Enter the character:");
        char inputChar = sc.next().charAt(0);

        System.out.println(countOccurrences(inputStr,inputChar));

        sc.close();
    }
}
