import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 04/01/2020
 */

public class MovieTesterV4 {
    public static void main(String[] args) {
        List<MovieV4> movies = new ArrayList<MovieV4>();
        movies.add(new MovieV4("Inception", 2010, "Legendary Pictures"));
        movies.add(new MovieV4("A New Hope", 1977, "Lucas Film"));
        movies.add(new MovieV4("Avatar", 2009, "20th Century Fox"));
        movies.add(new MovieV4("Jurassic Park", 1993, "Amblin Entertainment"));
        movies.add(new MovieV4("Back to the Future", 1985, "Universal Pictures"));
        movies.add(new MovieV4("Harry Potter", 2001, "Warner Bros. Pictures"));
        movies.add(new MovieV4("The Breakfast Club", 1985, "A&M Films"));
        movies.add(new MovieV4("Ferris Bueller's Day Off", 1986, "John Hughes"));
        movies.add(new MovieV4("Spider-Man: Homecoming", 2017, "Marvel"));
        movies.add(new MovieV4("Joker", 2019, "Warner Bros. Pictures"));

        showData(movies);

        System.out.println("\n\t<< Sort Descending by Title >>\n");
        showData(sortTitle(movies, 2));

        System.out.println("\n\t<< Sort Ascending by Title >>\n");
        showData(sortTitle(movies, 1));

        System.out.println("\n\t<< Sort Descending by Studio >>\n");
        showData(sortStudio(movies, 2));

        System.out.println("\n\t<< Sort Ascending by Studio >>\n");
        showData(sortStudio(movies, 1));

        System.out.println("\n\t<< Sort Descending by Year >>\n");
        showData(sortYear(movies, 2));

        System.out.println("\n\t<< Sort Ascending by Year >>\n");
        showData(sortYear(movies, 1));
    }

    public static void showData(List<MovieV4> movies) {
        for (MovieV4 m : movies) {
            System.out.println(m.toString());
        }
    }

    public static List<MovieV4> sortTitle(List<MovieV4> movies, int order) {
        boolean ascending = order == 1;
        List<MovieV4> finalList = new ArrayList<MovieV4>();
        if (movies.size() > 1) {
            List<List<MovieV4>> nestedMovies = breakInTwo(movies);
            nestedMovies.set(1, sortTitle(nestedMovies.get(1), order));
            nestedMovies.set(0, sortTitle(nestedMovies.get(0), order));

            while (nestedMovies.get(0).size() > 0 || nestedMovies.get(1).size() > 0) {
                if (nestedMovies.get(0).size() > 0 && nestedMovies.get(1).size() == 0) {
                    finalList.add(nestedMovies.get(0).get(0));
                    nestedMovies.get(0).remove(0);
                    continue;
                } else if (nestedMovies.get(0).size() == 0 && nestedMovies.get(1).size() > 0) {
                    finalList.add(nestedMovies.get(1).get(0));
                    nestedMovies.get(1).remove(0);
                    continue;
                }

                if ((nestedMovies.get(0).get(0).getTitle().compareTo(nestedMovies.get(1).get(0).getTitle())) * (ascending ? 1 : -1) > 0) {
                    finalList.add(nestedMovies.get(0).get(0));
                    nestedMovies.get(0).remove(0);
                } else {
                    finalList.add(nestedMovies.get(1).get(0));
                    nestedMovies.get(1).remove(0);
                }
            }
        } else {
            return movies;
        }
        return finalList;
    }

    public static List<MovieV4> sortStudio(List<MovieV4> movies, int order) {
        boolean ascending = order == 1;
        List<MovieV4> finalList = new ArrayList<MovieV4>();
        if (movies.size() > 1) {
            List<List<MovieV4>> nestedMovies = breakInTwo(movies);
            nestedMovies.set(1, sortStudio(nestedMovies.get(1), order));
            nestedMovies.set(0, sortStudio(nestedMovies.get(0), order));

            while (nestedMovies.get(0).size() > 0 || nestedMovies.get(1).size() > 0) {
                if (nestedMovies.get(0).size() > 0 && nestedMovies.get(1).size() == 0) {
                    finalList.add(nestedMovies.get(0).get(0));
                    nestedMovies.get(0).remove(0);
                    continue;
                } else if (nestedMovies.get(0).size() == 0 && nestedMovies.get(1).size() > 0) {
                    finalList.add(nestedMovies.get(1).get(0));
                    nestedMovies.get(1).remove(0);
                    continue;
                }

                if ((nestedMovies.get(0).get(0).getStudio().compareTo(nestedMovies.get(1).get(0).getStudio())) * (ascending ? 1 : -1) > 0) {
                    finalList.add(nestedMovies.get(0).get(0));
                    nestedMovies.get(0).remove(0);
                } else {
                    finalList.add(nestedMovies.get(1).get(0));
                    nestedMovies.get(1).remove(0);
                }
            }
        } else {
            return movies;
        }
        return finalList;
    }
    
    public static List<MovieV4> sortYear(List<MovieV4> movies, int order) {
        boolean ascending = order == 1;
        List<MovieV4> finalList = new ArrayList<MovieV4>();
        if (movies.size() > 1) {
            List<List<MovieV4>> nestedMovies = breakInTwo(movies);
            nestedMovies.set(1, sortYear(nestedMovies.get(1), order));
            nestedMovies.set(0, sortYear(nestedMovies.get(0), order));

            while (nestedMovies.get(0).size() > 0 || nestedMovies.get(1).size() > 0) {
                if (nestedMovies.get(0).size() > 0 && nestedMovies.get(1).size() == 0) {
                    finalList.add(nestedMovies.get(0).get(0));
                    nestedMovies.get(0).remove(0);
                    continue;
                } else if (nestedMovies.get(0).size() == 0 && nestedMovies.get(1).size() > 0) {
                    finalList.add(nestedMovies.get(1).get(0));
                    nestedMovies.get(1).remove(0);
                    continue;
                }

                if ((nestedMovies.get(0).get(0).getYear() - nestedMovies.get(1).get(0).getYear()) * (ascending ? -1 : 1) >= 0) {
                    finalList.add(nestedMovies.get(0).get(0));
                    nestedMovies.get(0).remove(0);
                } else {
                    finalList.add(nestedMovies.get(1).get(0));
                    nestedMovies.get(1).remove(0);
                }
            }
        } else {
            return movies;
        }
        return finalList;
    }

    public static List<List<MovieV4>> breakInTwo(List<MovieV4> movies) {
        List<List<MovieV4>> returnList = new ArrayList<List<MovieV4>>();
        returnList.add(new ArrayList<MovieV4>());
        returnList.add(new ArrayList<MovieV4>());

        int index = (movies.size() / 2);

        for (int i = 0; i < index; i++) {
            returnList.get(0).add(movies.get(i));
        }
        for (int i = index; i < movies.size(); i++) {
            returnList.get(1).add(movies.get(i));
        }
        return returnList;
    }
}