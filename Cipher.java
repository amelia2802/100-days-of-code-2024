/*
 *  Caesar Cipher | Code Challenge
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'caesarCipher' that takes a string and a shift value as arguments and returns the string encrypted using the Caesar cipher.
    Rules You must post your code in the code challenge channel
    The shift value represents the number of positions each letter should be shifted to the right in the alphabet.
    The input string will only contain alphabetical characters and spaces.
    The output string should maintain the case of the original letters.
    Example
    caesarCipher('hello world', 3) => 'khoor zruog'
 */

import java.util.*;

class Cipher {

    public static String ceasarCipher(String paraStr,int num){
        char[] newCharArr = paraStr.toLowerCase().toCharArray();

        for(int i=0;i<newCharArr.length;i++){
            if (Character.isLetter(newCharArr[i])) {
                newCharArr[i] = (char) (newCharArr[i] + num);
            }
        }

        String output_code = new String(newCharArr);

        return output_code;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input:");
        String input_str=sc.nextLine();

        System.out.println("Enter the shift value:");
        int shiftValue=sc.nextInt();

        System.out.println(ceasarCipher(input_str,shiftValue));

        sc.close();
    }
}
