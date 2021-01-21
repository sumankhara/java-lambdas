package lambdaexpressions;

import javax.swing.*;
import java.util.function.Predicate;

public class Exercise3 {
    public static void main(String[] args) {
        Runnable helloWorld = () -> System.out.println("hello world");

        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));

        //System.out.println("calling check: " + check(x -> x > 5));
    }

    public static boolean check(Predicate<Integer> predicate) {
        return predicate.test(10);
    }

    public static boolean check(IntPred predicate) {
        return predicate.test(3);
    }
}

interface IntPred {
    boolean test(Integer value);
}
