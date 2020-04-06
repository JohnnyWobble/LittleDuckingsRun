import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 04/01/2020
 */

public class MovieTesterV3 {
    public static void main(String[] args) {
        List<MovieV3> movies = new ArrayList<MovieV3>();
        movies.add(new MovieV3("Inception", 2010, "Legendary Pictures"));
        movies.add(new MovieV3("A New Hope", 1977, "Lucas Film"));
        movies.add(new MovieV3("Avatar", 2009, "20th Century Fox"));
        movies.add(new MovieV3("Jurassic Park", 1993, "Amblin Entertainment"));
        movies.add(new MovieV3("Back to the Future", 1985, "Universal Pictures"));
        movies.add(new MovieV3("Harry Potter", 2001, "Warner Bros. Pictures"));
        movies.add(new MovieV3("The Breakfast Club", 1985, "A&M Films"));
        movies.add(new MovieV3("Ferris Bueller's Day Off", 1986, "John Hughes"));
        movies.add(new MovieV3("Spider-Man: Homecoming", 2017, "Marvel"));
        movies.add(new MovieV3("Joker", 2019, "Warner Bros. Pictures"));

        showData(movies);

        System.out.println("\n\t<< Sort Descending by Title >>\n");
        sortTitle(movies, 2);

        System.out.println("\n\t<< Sort Ascending by Title >>\n");
        sortTitle(movies, 1);

        System.out.println("\n\t<< Sort Descending by Studio >>\n");
        sortStudio(movies, 2);

        System.out.println("\n\t<< Sort Ascending by Studio >>\n");
        sortStudio(movies, 1);

        System.out.println("\n\t<< Sort Descending by Year >>\n");
        sortYear(movies, 2);

        System.out.println("\n\t<< Sort Ascending by Year >>\n");
        sortYear(movies, 1);
    }

    public static void showData(List<MovieV3> movies) {
        for (MovieV3 m : movies) {
            System.out.println(m.toString());
        }
    }

    public static void sortTitle(List<MovieV3> movies, int order) {
        int currentBest = 0;
        boolean ascending = order == 1;
        for (int i = 0; i < movies.size(); i++) {
            currentBest = i;
            for (int j = i; j < movies.size(); j++) {
                if (movies.get(currentBest).getTitle().compareTo(movies.get(j).getTitle()) * (ascending ? -1 : 1) > 0) {
                    currentBest = j;
                }
            }
            movies.add(i, movies.get(currentBest));
            movies.remove(currentBest + 1);
        }
        showData(movies);
    }

    public static void sortStudio(List<MovieV3> movies, int order) {
        int currentBest = 0;
        boolean ascending = order == 1;
        for (int i = 0; i < movies.size(); i++) {
            currentBest = i;
            for (int j = i; j < movies.size(); j++) {
                if (movies.get(currentBest).getStudio().compareTo(movies.get(j).getStudio()) * (ascending ? -1 : 1) > 0) {
                    currentBest = j;
                }
            }
            movies.add(i, movies.get(currentBest));
            movies.remove(currentBest + 1);
        }
        showData(movies);
    }
    
    public static void sortYear(List<MovieV3> movies, int order) {
        int currentBest = 0;
        boolean ascending = order == 1;
        for (int i = 0; i < movies.size(); i++) {
            currentBest = i;
            for (int j = i; j < movies.size(); j++) {
                if ((movies.get(currentBest).getYear() - movies.get(j).getYear()) * (ascending ? -1 : 1) < 0) {
                    currentBest = j;
                }
            }
            movies.add(i, movies.get(currentBest));
            movies.remove(currentBest + 1);
        }
        showData(movies);
    }
}



// for (int i = 0; i < movies.size(); i++) {
//     currentBest = i;
//     for (int j = i; j < movies.size(); j++) {
//         if (movies.get(currentBest).getYear().compareTo(movies.get(j).getYear()) * (ascending ? -1 : 10) < 0) {
//             currentBest = j;
//         }
//     }
//     MovieV3 tmp = movies.get(i);
//     movies.set(i, movies.get(currentBest));
//     movies.set(currentBest, tmp);
// }