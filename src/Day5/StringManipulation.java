package Day5;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();


        String withoutWhitespace = sentence.replaceAll("\\s+", "");
        System.out.println("Sentence without whitespace: " + withoutWhitespace);

        System.out.println("Enter the word to replace:");
        String wordToReplace = scanner.nextLine().toLowerCase();

        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.nextLine();

        String replacedSentence = sentence.replaceAll(wordToReplace, replacementWord);
        System.out.println("Sentence with replaced word: " + replacedSentence);

        String[] words = sentence.split("\\s+");
        System.out.println("Words in reverse order:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]+ " ");
        }
    }
}
