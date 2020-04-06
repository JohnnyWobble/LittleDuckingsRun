import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 04/01/2020
 */

public class MovieTester {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Inception", 2010, "Legendary Pictures"));
        movies.add(new Movie("A New Hope", 1977, "Lucas Film"));
        movies.add(new Movie("Avatar", 2009, "20th Century Fox"));
        movies.add(new Movie("Jurassic Park", 1993, "Amblin Entertainment"));
        movies.add(new Movie("Back to the Future", 1985, "Universal Pictures"));
        movies.add(new Movie("Harry Potter", 2001, "Warner Bros. Pictures"));
        movies.add(new Movie("The Breakfast Club", 1985, "A&M Films"));
        movies.add(new Movie("Ferris Bueller's Day Off", 1986, "John Hughes"));
        movies.add(new Movie("Spider-Man: Homecoming", 2017, "Marvel"));
        movies.add(new Movie("Joker", 2019, "Warner Bros. Pictures"));

        showData(movies);

        System.out.println("\n\t<< Sort Ascending by Title >>\n");
        sortTitle(movies, 1);

        System.out.println("\n\t<< Sort Descending by Title >>\n");
        sortTitle(movies, -1);

        System.out.println("\n\t<< Sort Ascending by Studio >>\n");
        sortStudio(movies, 1);

        System.out.println("\n\t<< Sort Descending by Studio >>\n");
        sortStudio(movies, -1);

        System.out.println("\n\t<< Sort Ascending by Year >>\n");
        sortYear(movies, 1);

        System.out.println("\n\t<< Sort Descending by Year >>\n");
        sortYear(movies, -1);
    }

    public static void showData(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println(m.toString());
        }
    }

    public static void sortTitle(List<Movie> movies, int order) {
        List<Movie> newMovies = new ArrayList<Movie>();
        boolean ascending = order == 1;

        for (Movie m : movies) {
            if (newMovies.size() == 0) {
                newMovies.add(m);
            } else {
                for (int i = 0; i < newMovies.size(); i++) {
                    if (newMovies.get(i).getTitle().compareTo(m.getTitle()) * (ascending ? 1 : -1) >= 0) {
                        newMovies.add(i, m);
                        break;
                    } else if ((i + 1) == newMovies.size()) {
                        newMovies.add(m);
                        break;
                    }
                }
            }
        }
        showData(newMovies);
    }

    public static void sortStudio(List<Movie> movies, int order) {
        List<Movie> newMovies = new ArrayList<Movie>();
        boolean ascending = order == 1;

        for (Movie m : movies) {
            if (newMovies.size() == 0) {
                newMovies.add(m);
            } else {
                for (int i = 0; i < newMovies.size(); i++) {
                    if (newMovies.get(i).getStudio().compareTo(m.getStudio()) * (ascending ? 1 : -1) >= 0) {
                        newMovies.add(i, m);
                        break;
                    } else if ((i + 1) == newMovies.size()) {
                        newMovies.add(m);
                        break;
                    }
                }
            }
        }
        showData(newMovies);
    }
    
    public static void sortYear(List<Movie> movies, int order) {
        List<Movie> newMovies = new ArrayList<Movie>();
        boolean ascending = order == 1;

        for (Movie m : movies) {
            if (newMovies.size() == 0) {
                newMovies.add(m);
            } else {
                for (int i = 0; i < newMovies.size(); i++) {
                    if ((m.getYear() - newMovies.get(i).getYear()) * (ascending ? 1 : -1) >= 0) {
                        newMovies.add(i, m);
                        break;
                    } else if ((i + 1) == newMovies.size()) {
                        newMovies.add(m);
                        break;
                    }
                }
            }
        }
        showData(newMovies);
    }
}