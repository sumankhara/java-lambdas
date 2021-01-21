package streams;

import chapter1.Artist;
import chapter1.SampleData;

import java.util.List;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
        List<Artist> artists = SampleData.getThreeArtists();
        long totalMembers = artists.stream().flatMap(artist -> artist.getMembers()).count();
        System.out.println("total members: " + totalMembers);
    }
}
