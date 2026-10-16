import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        //Vars
        String word = "";
        String lowerCaseWord = "";
        String reversedWord = "";
        int length;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("Enter any word:");
        word = scan.nextLine();
        lowerCaseWord = word.toLowerCase();
        length = lowerCaseWord.length();

        //Checker
        for (int i = length - 1; i >= 0; i--) {
            reversedWord += lowerCaseWord.substring(i, i + 1);
        }

        if (reversedWord.equalsIgnoreCase(word)) {
            System.out.println("Your word '" + word + "' is a palindrome.");
        } else {
            System.out.println("Your word '" + word + "' is not a palindrome.");
        }
    }
}
