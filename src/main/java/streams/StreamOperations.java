package streams;

import chapter1.Track;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;

public class StreamOperations {
    public static void main (String[] args) {
        // collect(toList())
        List<String> collected = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        System.out.println("list: " + collected);

        // map
        collected = Stream.of("a", "hello", "world", "january", "monday")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("uppercase list: " + collected);

        // filter
        List<String> beginningWithNumbers = Stream.of("a1", "1bcd", "14hgd", "g1b23")
                .filter(word -> isDigit(word.charAt(0)))
                .collect(Collectors.toList());
        System.out.println("list beginning with numbers: " + beginningWithNumbers);

        // flatMap
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("stream list: " + together);

        // max and min
        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));

        Track shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
        System.out.println("shortest track: " + shortestTrack.getName());

        Track longestTrack = tracks.stream()
                .max(Comparator.comparing(track -> track.getLength()))
                .get();
        System.out.println("longest track: " + longestTrack.getName());

        // reduce
        int count = Stream.of(1, 2, 3 ,4)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println("sum using reduce: " + count);
    }
}
