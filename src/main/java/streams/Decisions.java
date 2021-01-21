package streams;

import chapter1.SampleData;

import java.util.Set;
import java.util.stream.Collectors;

public class Decisions {
    public static void main (String[] args) {
        Set<String> origins = SampleData.manyTrackAlbum
                .getMusicians()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(artist -> artist.getNationality())
                .collect(Collectors.toSet());
        System.out.println(origins);
    }
}
