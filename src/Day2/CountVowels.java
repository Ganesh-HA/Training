package Day2;

import java.util.Scanner;

public class CountVowels {
    public static void countVowels() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scr.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
           String s1 = s.toLowerCase();
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch =='i'||ch=='o' || ch =='u') {
                count++;
            }
        }
        System.out.println("Number of vowels present in String " +count);
    }

}
