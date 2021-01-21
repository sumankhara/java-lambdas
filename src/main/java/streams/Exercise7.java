package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello World",
                "Hello Suman Khara",
                "Hello Unmisha Khara",
                "Hello Ushnik Khara");
        Optional<String> maxLowercaseString = strings.stream()
                .max(Comparator.comparing(Exercise7::numberOfLowercaseLetters));

        System.out.println("string with maximum number of lowercase letters: " + maxLowercaseString.get());
    }

    public static long numberOfLowercaseLetters(String str){
        return str.chars().filter(Character::isLowerCase).count();
    }
}
