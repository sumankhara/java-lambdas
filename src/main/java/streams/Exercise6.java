package streams;

import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
        String text = "A Quick Brown Fox Jumped Over The Lazy Dog";
        long totalCharacters = text.chars().filter(ch -> Character.isLetter(ch)).count();
        long lowercaseLetters = text.chars()
                .filter(ch -> Character.isLowerCase(ch))
                .count();
        System.out.println("total characters: " + totalCharacters);
        System.out.println("number of lowercase letters: " + lowercaseLetters);
    }
}
