package Day2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Select an option:");
            System.out.println("1. Count Vowels in a String");
            System.out.println("2. Calculate Average of Array Elements");
            System.out.println("3. Check Palindrome String");
            System.out.println("4. Array Reversal");
            System.out.print("Enter 0 to Exit ");

            int choice = scr.nextInt();
            scr.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the Program..");
                    return;
                case 1:
                    CountVowels.countVowels();
                    break;
                case 2:
                    ArrayAverage.calculateAverage();
                    break;
                case 3:
                    PalindromeChecker.checkPalindrome();
                case 4:
                    ArrayReversal.reverseArray();
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }
    }
}