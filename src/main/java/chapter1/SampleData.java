package chapter1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class SampleData {

    public static final Artist johnColtrane = new Artist("John Coltrane", "US");

    public static final Artist johnLennon = new Artist("John Lennon", "UK");
    public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
    public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
    public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");
    public static final Artist elvisPresley = new Artist("Elvis Presley", "US");
    public static final Artist bobDylan = new Artist("Bob Dylan", "US");
    public static final Artist raviShankar = new Artist("Ravi Shankar", "India");
    public static final Artist amzadAli = new Artist("Amzad Ali", "India");

    public static final List<Artist> membersOfTheBeatles = asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);

    public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");

    public static final Album aLoveSupreme = new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), asList(johnColtrane));

    public static final Album sampleShortAlbum = new Album("sample Short Album", asList(new Track("short track", 30)), asList(johnColtrane));

    public static final Album manyTrackAlbum = new Album("sample Short Album", asList(new Track("short track", 45), new Track("short track 2", 530), new Track("short track 3", 30), new Track("short track 4", 30), new Track("short track 5", 30)), asList(theBeatles));

    public static Stream<Album> albums = Stream.of(aLoveSupreme, manyTrackAlbum);

    public static List<Album> albumList = asList(aLoveSupreme, manyTrackAlbum);

    public static Stream<Artist> threeArtists() {
        return Stream.of(johnColtrane, johnLennon, theBeatles);
    }

    public static List<Artist> getThreeArtists() {
        return asList(johnColtrane, johnLennon, theBeatles);
    }

    /*public static Stream<Artist> allArtists() {
       return Stream.of(johnColtrane, johnLennon, paulMcCartney, georgeHarrison, ringoStarr);
    }*/

    public static List<Artist> allArtists() {
        return asList(johnColtrane, johnLennon, paulMcCartney, georgeHarrison, ringoStarr, elvisPresley, bobDylan, raviShankar, amzadAli);
    }
}
