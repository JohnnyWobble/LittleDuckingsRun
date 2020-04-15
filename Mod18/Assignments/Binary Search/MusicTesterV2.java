import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/**
 * 
 * @author Max Gordon
 * @version 04/15/2020
 */

public class MusicTesterV2 {
    public static void main(String[] args) {
        List<MusicV2> musics = new ArrayList<MusicV2>();
        musics.add(new MusicV2("Beat it", 1982, "Michael Jackson"));
        musics.add(new MusicV2("Second Chances", 2015, "Imagine Dragons"));
        musics.add(new MusicV2("Back in Black", 1980, "AC/DC"));
        musics.add(new MusicV2("American Pie", 1971, "Don McLean"));
        musics.add(new MusicV2("1983", 2010, "Neon Trees"));
        musics.add(new MusicV2("Dying in LA", 2018, "Panic! At the disco"));
        musics.add(new MusicV2("Bohemian Rhapsody", 1985, "Queen"));
        musics.add(new MusicV2("Bud like you", 2017, "AJR"));
        musics.add(new MusicV2("Subdivisions", 1982, "Rush"));
        musics.add(new MusicV2("Take on me", 1985, "a-ha"));
        musics.add(new MusicV2("Thunderstruck", 1990, "AC/DC"));

        showData(musics);

        System.out.println("\n\t<< Searching by Title >>\n");
        musics = sortTitle(musics, 1);

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
        musics = sortYear(musics, 1);

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
        musics = sortArtist(musics, 1);

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

    public static void showData(List<MusicV2> musics) {
        for (MusicV2 m : musics) {
            System.out.println(m);
        }
    }

    public static void findTitle(List<MusicV2> musics, String title, int low, int high) {
        int centerIndex = (low + high) / 2;
        MusicV2 center = musics.get(centerIndex);
        if (center.getTitle().equals(title)) {
            linearPrint(musics, centerIndex, (MusicV2 m) -> m.getTitle().equals(title));
            return;
        } else if (center.getTitle().compareTo(title) < 0) {
            high = Math.max(centerIndex - 1, low);
        } else {
            low = Math.min(centerIndex + 1, high);
        }

        if (low == high) {
            linearPrint(musics, low, (MusicV2 m) -> m.getTitle().equals(title));
        } else {
            findTitle(musics, title, low, high);
        }
    }

    public static void findYear(List<MusicV2> musics, int year, int low, int high) {
        int centerIndex = (low + high) / 2;
        MusicV2 center = musics.get(centerIndex);
        if (center.getYear() == year) {
            linearPrint(musics, centerIndex, (MusicV2 m) -> m.getYear() == year);
            return;
        } else if (center.getYear() > year) {
            high = Math.max(centerIndex - 1, low);
        } else {
            low = Math.min(centerIndex + 1, high);
        }

        if (low == high) {
            linearPrint(musics, low, (MusicV2 m) -> m.getYear() == year);
        } else {
            findYear(musics, year, low, high);
        }
    }

    public static void findYear(List<MusicV2> musics, int year) {
        findYear(musics, year, 0, musics.size() - 1);
    }

    public static void findArtist(List<MusicV2> musics, String artist) {
        findArtist(musics, artist, 0, musics.size() - 1);
    }

    public static void findTitle(List<MusicV2> musics, String title) {
        findTitle(musics, title, 0, musics.size() - 1);
    }

    public static void findArtist(List<MusicV2> musics, String artist, int low, int high) {
        int centerIndex = (low + high) / 2;
        MusicV2 center = musics.get(centerIndex);
        if (center.getArtist().equals(artist)) {
            linearPrint(musics, centerIndex, (MusicV2 m) -> m.getArtist().equals(artist));
            return;
        } else if (center.getArtist().compareTo(artist) < 0) {
            high = Math.max(centerIndex - 1, low);
        } else {
            low = Math.min(centerIndex + 1, high);
        }

        if (low == high) {
            linearPrint(musics, low, (MusicV2 m) -> m.getArtist().equals(artist));
        } else {
            findArtist(musics, artist, low, high);
        }
    }

    public static void linearPrint(List<MusicV2> musics, int index, Function<MusicV2, Boolean> key) {
        while (index > 0 && key.apply(musics.get(index - 1)) ) {
            index -= 1;
        }

        while (index < musics.size() && key.apply(musics.get(index))) {
            System.out.println(musics.get(index));
            index += 1;
        }
    }

    public static List<MusicV2> sortYear(List<MusicV2> music, int order) {
        boolean ascending = order == 1;
        List<MusicV2> finalList = new ArrayList<MusicV2>();
        if (music.size() > 1) {
            List<List<MusicV2>> nestedMusic = breakInTwo(music);
            nestedMusic.set(1, sortYear(nestedMusic.get(1), order));
            nestedMusic.set(0, sortYear(nestedMusic.get(0), order));

            while (nestedMusic.get(0).size() > 0 || nestedMusic.get(1).size() > 0) {
                if (nestedMusic.get(0).size() > 0 && nestedMusic.get(1).size() == 0) {
                    finalList.add(nestedMusic.get(0).get(0));
                    nestedMusic.get(0).remove(0);
                    continue;
                } else if (nestedMusic.get(0).size() == 0 && nestedMusic.get(1).size() > 0) {
                    finalList.add(nestedMusic.get(1).get(0));
                    nestedMusic.get(1).remove(0);
                    continue;
                }

                if ((nestedMusic.get(0).get(0).getYear() - nestedMusic.get(1).get(0).getYear()) * (ascending ? -1 : 1) >= 0) {
                    finalList.add(nestedMusic.get(0).get(0));
                    nestedMusic.get(0).remove(0);
                } else {
                    finalList.add(nestedMusic.get(1).get(0));
                    nestedMusic.get(1).remove(0);
                }
            }
        } else {
            return music;
        }
        return finalList;
    }

    public static List<MusicV2> sortTitle(List<MusicV2> music, int order) {
        boolean ascending = order == 1;
        List<MusicV2> finalList = new ArrayList<MusicV2>();
        if (music.size() > 1) {
            List<List<MusicV2>> nestedMusic = breakInTwo(music);
            nestedMusic.set(1, sortTitle(nestedMusic.get(1), order));
            nestedMusic.set(0, sortTitle(nestedMusic.get(0), order));

            while (nestedMusic.get(0).size() > 0 || nestedMusic.get(1).size() > 0) {
                if (nestedMusic.get(0).size() > 0 && nestedMusic.get(1).size() == 0) {
                    finalList.add(nestedMusic.get(0).get(0));
                    nestedMusic.get(0).remove(0);
                    continue;
                } else if (nestedMusic.get(0).size() == 0 && nestedMusic.get(1).size() > 0) {
                    finalList.add(nestedMusic.get(1).get(0));
                    nestedMusic.get(1).remove(0);
                    continue;
                }

                if ((nestedMusic.get(0).get(0).getTitle().compareTo(nestedMusic.get(1).get(0).getTitle())) * (ascending ? 1 : -1) > 0) {
                    finalList.add(nestedMusic.get(0).get(0));
                    nestedMusic.get(0).remove(0);
                } else {
                    finalList.add(nestedMusic.get(1).get(0));
                    nestedMusic.get(1).remove(0);
                }
            }
        } else {
            return music;
        }
        return finalList;
    }

    public static List<MusicV2> sortArtist(List<MusicV2> music, int order) {
        boolean ascending = order == 1;
        List<MusicV2> finalList = new ArrayList<MusicV2>();
        if (music.size() > 1) {
            List<List<MusicV2>> nestedMusic = breakInTwo(music);
            nestedMusic.set(1, sortArtist(nestedMusic.get(1), order));
            nestedMusic.set(0, sortArtist(nestedMusic.get(0), order));

            while (nestedMusic.get(0).size() > 0 || nestedMusic.get(1).size() > 0) {
                if (nestedMusic.get(0).size() > 0 && nestedMusic.get(1).size() == 0) {
                    finalList.add(nestedMusic.get(0).get(0));
                    nestedMusic.get(0).remove(0);
                    continue;
                } else if (nestedMusic.get(0).size() == 0 && nestedMusic.get(1).size() > 0) {
                    finalList.add(nestedMusic.get(1).get(0));
                    nestedMusic.get(1).remove(0);
                    continue;
                }

                if ((nestedMusic.get(0).get(0).getArtist().compareTo(nestedMusic.get(1).get(0).getArtist())) * (ascending ? 1 : -1) > 0) {
                    finalList.add(nestedMusic.get(0).get(0));
                    nestedMusic.get(0).remove(0);
                } else {
                    finalList.add(nestedMusic.get(1).get(0));
                    nestedMusic.get(1).remove(0);
                }
            }
        } else {
            return music;
        }
        return finalList;
    }

    public static List<List<MusicV2>> breakInTwo(List<MusicV2> music) {
        List<List<MusicV2>> returnList = new ArrayList<List<MusicV2>>();
        returnList.add(new ArrayList<MusicV2>());
        returnList.add(new ArrayList<MusicV2>());

        int index = (music.size() / 2);

        for (int i = 0; i < index; i++) {
            returnList.get(0).add(music.get(i));
        }
        for (int i = index; i < music.size(); i++) {
            returnList.get(1).add(music.get(i));
        }
        return returnList;
    }
}