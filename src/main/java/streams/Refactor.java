package streams;

import chapter1.Album;
import chapter1.SampleData;
import chapter1.Track;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Refactor {
    public static void main (String[] args) {
        System.out.println("long tracks: " + findLongTracks(SampleData.albumList));
    }

    public static Set<String> findLongTracks(List<Album> albums){
        return albums.stream()
                .flatMap(album -> album.getTracks())
                .filter(track -> track.getLength() > 60)
                .map(track -> track.getName())
                .collect(Collectors.toSet());
    }
}
