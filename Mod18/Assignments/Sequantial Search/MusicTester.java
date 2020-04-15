import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 04/15/2020
 */

public class MusicTester {
    public static void main(String[] args) {
        List<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Beat it", 1982, "Michael Jackson"));
        musics.add(new Music("Second Chances", 2015, "Imagine Dragons"));
        musics.add(new Music("Back in Black", 1980, "AC/DC"));
        musics.add(new Music("American Pie", 1971, "Don McLean"));
        musics.add(new Music("1983", 2010, "Neon Trees"));
        musics.add(new Music("Dying in LA", 2018, "Panic! At the disco"));
        musics.add(new Music("Bohemian Rhapsody", 1985, "Queen"));
        musics.add(new Music("Bud like you", 2017, "AJR"));
        musics.add(new Music("Subdivisions", 1982, "Rush"));
        musics.add(new Music("Take on me", 1985, "a-ha"));
        musics.add(new Music("Thunderstruck", 1990, "AC/DC"));

        showData(musics);

        System.out.println("\n\t<< Searching by Title >>\n");

        System.out.println(" > Searching: \"Bud like you\"");
        findTitle(musics, "Bud like you");
        System.out.println();
        System.out.println(" > Searching: \"American Pie\"");
        findTitle(musics, "American Pie");
        System.out.println();
        System.out.println(" > Searching: \"Finding Nemo\"");
        findTitle(musics, "Finding Nemo");
        System.out.println();

        
        System.out.println("\n\t<< Searching by Year >>\n");

        System.out.println(" > Searching: 1982");
        findYear(musics, 1982);
        System.out.println();
        System.out.println(" > Searching: 2017");
        findYear(musics, 2017);
        System.out.println();
        System.out.println(" > Searching: 1985");
        findYear(musics, 1985);
        System.out.println();
        System.out.println(" > Searching: 2022");
        findYear(musics, 2022);
        System.out.println();


        System.out.println("\n\t<< Searching by Artist >>\n");

        System.out.println(" > Searching: \"AC/DC\"");
        findArtist(musics, "AC/DC");
        System.out.println();
        System.out.println(" > Searching: \"AJR\"");
        findArtist(musics, "AJR");
        System.out.println();
        System.out.println(" > Searching: \"Rolling Stones\"");
        findArtist(musics, "Rolling Stones");
        System.out.println();
    }

    public static void showData(List<Music> musics) {
        for (Music m : musics) {
            System.out.println(m.toString());
        }
    }

    public static void findTitle(List<Music> musics, String title) {
        for (Music m : musics) {
            if (m.getTitle().equals(title)) {
                System.out.println(m.toString());
            }
        }
    }

    public static void findYear(List<Music> musics, int year) {
        for (Music m : musics) {
            if (m.getYear() == year) {
                System.out.println(m.toString());
            }
        }
    }

    public static void findArtist(List<Music> musics, String artist) {
        for (Music m : musics) {
            if (m.getArtist().equals(artist)) {
                System.out.println(m.toString());
            }
        }
    }
}