package streams;

import chapter1.Artist;
import chapter1.SampleData;

import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static final String NATIONALITY = "US";
    public static void main (String[] args) {
        List<Artist> allArtists = SampleData.allArtists();
        System.out.println("Number of artists from " + NATIONALITY + " (using for loop): " + countArtistsUsingForLoop(allArtists));
        System.out.println("Number of artists from " + NATIONALITY + " (using iterator): " + countArtistsUsingIterator(allArtists));
        System.out.println("Number of artists from " + NATIONALITY + " (using stream): " + countArtistsUsingStream(allArtists));
    }

    public static int countArtistsUsingForLoop(List<Artist> allArtists) {
        int count = 0;
        for(Artist artist: allArtists){
            if(artist.isFrom(NATIONALITY)){
                count++;
            }
        }
        return count;
    }

    public static int countArtistsUsingIterator(List<Artist> allArtists) {
        int count = 0;
        Iterator<Artist> iterator = allArtists.iterator();
        while(iterator.hasNext()){
          Artist artist = iterator.next();
          if(artist.isFrom(NATIONALITY)){
              count++;
          }
        }
        return count;
    }

    public static long countArtistsUsingStream(List<Artist> allArtists) {
        return allArtists.stream()
                .filter(artist -> {
                    System.out.println(artist.getName());
                    return artist.isFrom(NATIONALITY);
                })
                .count();
    }
}
