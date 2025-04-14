/* 1. Create a Java program that takes a user-inputted string and performs the following tasks:
 1. Reverse the string: Reverse the order of characters in the string.
 2. Checkfor Palindrome: Determine if the string is a palindrome (reads the same backward
 as forward).
 3. Count Vowels: Count the number of vowels (a, e, i, o, u) in the string.
 4. (OPTIONAL) Extract Email Addresses: Extract all email addresses from the string
 using regular expressions. */

import java.util.Scanner;
import java.util.regex.*;

 public class question1 {
    public static void main(String[] args) {
        String reversed = "";
        boolean isPalindrome = true;
        int vowelCount = 0;
        boolean foundEmail = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next()+input.nextLine();

        // 1. Reverse the string
        for(int i=str.length();i>0;i--){
            //System.out.print(str.charAt(i-1)); // able to print out the reversed string

            reversed = reversed + str.charAt(i-1); // store the reversed string in a variable
        }
        System.out.println("Reversed string: " + reversed); 

        // 2. Check for Palindrome
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != reversed.charAt(i)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
            
        }

        // 3. Count Vowels (A,E,I,O,U)
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
               str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);

        // 4. Extract Email Addresses (OPTIONAL)
        // ------------------------- C O P I L O T -------------------------
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"; 
        /* 
         * [a-zA-Z0-9._%+-]        空格之后 @之前 
         * @[a-zA-Z0-9.-]          @之后  --> g.mail-domain
         * \\.[a-zA-Z]{2,}         .之后，一定要至少2个字符 --> .com, .org, .net, .edu
         */
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(str); // math pattern with the input str

        System.out.print("Extracted email addresses: ");
        while (matcher.find()) {
            foundEmail = true;
            System.out.println(matcher.group());
        }

        if(!foundEmail){
            System.out.println("No email addresses found in the string.");
        }

        input.close(); 
    }
 }