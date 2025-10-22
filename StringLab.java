import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Task 1: Working with String Methods
        String str = " Welcome to the Java String Lab! ";
        System.out.println("Part 1: Program to point out what attributes and modifying a specific predetermined string.");
        System.out.println("Original String: \"" + str + "\"");
        
        // length() -  How long is the string provided
        System.out.println("Length of string: " + str.length());
        
        // charAt() - Pull a character from a string from a predetermined number, ex - str.charAt(index:5) in the string Nicolaus will take l
        System.out.println("Character at index 7: " + str.charAt(7));
        
        // substring() - Pull a group of characters from beginIndex to endIndex, ex - str.substring(beginIndex:14, endIndex:20) will take 
        System.out.println("Extracted word 'Java': " + str.substring(15, 20));
        
        // toUpperCase() and toLowerCase() - self explanatory, this will make all characters in a string upper or lowercase depending on what they use
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // indexOf() - This will find what number character the listed word is found.
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        
        // contains() - This will see whether the word or character in the program is present in the string
        System.out.println("Contains 'Lab': " + str.contains("Lab"));
        
        // replace() - This will change chracter or string of character with another character or string of character
        System.out.println("After replacing 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));
        
        // split() - This will take each word in the string and put them in their own line.
        String[] words = str.split(" ");
        System.out.println("Words after splitting by space:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // trim() - This deletes unessary spaces
        System.out.println("After trimming: \"" + str.trim() + "\"");
        
        // equals() and equalsIgnoreCase() - 
        String compareStr = "java string lab!";
        System.out.println("equals('java string lab!'): " + str.equals(compareStr));
        System.out.println("equalsIgnoreCase('java string lab!'): " + str.equalsIgnoreCase(compareStr));
        
        // Task 2: Loop Challenges with Strings
        System.out.println("\nTask 2: Loop Challenges with Strings");
        
        // For Loop: Count Vowels - You take out a choice of characters (in this case, vowels) and have them ready for future use
        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in original string: " + vowelCount);
        
        // While Loop: Check for Palindrome - This first takes a string and then reversing it and finally seeing if it is the same reversed
        String palindrome = "racecar";
        System.out.println("Checking if \"" + palindrome + "\" is a palindrome:");
        boolean isPalindrome = true;
        int left = 0;
        int right = palindrome.length() - 1;
        while (left < right) {
            if (palindrome.charAt(left) != palindrome.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("\"" + palindrome + "\" is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
        
        // Do...While Loop: Input Validation
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a sentence containing 'Java': ");
            input = scanner.nextLine();
        } while (!input.contains("Java"));
        System.out.println("Thank you!");
        
        // Task 3: Working with StringBuilder
        System.out.println("\nTask 3: StringBuilder Operations");
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        System.out.println("Initial StringBuilder: " + sb);
        
        // append() - Replaces on estring with another
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);
        
        // insert() - inserts text into the string
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb);
        
        // delete() -  deletes a certain part of text
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + 8);
        System.out.println("After delete: " + sb);
        
        // reverse() - reverses text
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Task 4: Working with StringBuffer
        System.out.println("\nTask 4: StringBuffer Operations");
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        System.out.println("Initial StringBuffer: " + sbf);
        
        // append()
        sbf.append(" - Learning Java");
        System.out.println("After append: " + sbf);
        
        // insert()
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sbf);
        
        // delete()
        sbf.delete(sbf.indexOf("Learning"), sbf.indexOf("Learning") + 8);
        System.out.println("After delete: " + sbf);
        
        // reverse()
        sbf.reverse();
        System.out.println("After reverse: " + sbf);
        
        scanner.close();
    }
}