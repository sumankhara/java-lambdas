package lambdaexpressions;

import java.util.function.Function;

public class Exercise1 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 4 = " + square.apply(4));

        Function<Long, Long> validFunction = x -> x + 1;
        System.out.println(validFunction.apply(36l));
    }
}
