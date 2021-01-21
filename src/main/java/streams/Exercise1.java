package streams;

import chapter1.Album;
import chapter1.Artist;
import chapter1.SampleData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main (String[] args) {
        System.out.println("add up: " + addUp(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        System.out.println("artist names and origins: " + getNamesAndOrigins(SampleData.allArtists()));
        List<String> albumsWithAtMostThreeTracks = getAlbumsWithAtMostThreeTracks(SampleData.albumList)
                .stream()
                .map(album -> album.getName())
                .collect(Collectors.toList());
        System.out.println("albums with at most 3 tracks: " + albumsWithAtMostThreeTracks);
    }

    public static int addUp(Stream<Integer> numbers){
        return numbers.reduce(0, (acc, element) -> acc + element);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists){
        return artists.stream()
                .map(artist -> "Name: " + artist.getName() + " Nationality: " + artist.getNationality())
                .collect(Collectors.toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums){
        return albums.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(Collectors.toList());
    }
}
