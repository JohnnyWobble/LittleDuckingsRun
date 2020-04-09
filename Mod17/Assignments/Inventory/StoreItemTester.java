import java.util.List;
import java.util.ArrayList;
/**
 * 
 * @author Max Gordon
 * @version 04/08/2020
 */

public class StoreItemTester {
    public static void main(String[] args) {
        List<StoreItem> items = new ArrayList<StoreItem>();
        items.add(new StoreItem("Brick", 1.99, 201, 9823459));
        items.add(new StoreItem("2x4 Wood Plank", 12.99, 129, 432534523));
        items.add(new StoreItem("Handsaw", 22.87, 23, 45675674));
        items.add(new StoreItem("Tile", 17.34, 834, 234342));
        items.add(new StoreItem("Power Drill", 88.73, 56, 98567454));
        items.add(new StoreItem("Hammer", 45.15, 345, 34587394));
        items.add(new StoreItem("Red Paint", 28.56, 12, 345988));
        items.add(new StoreItem("Screwdriver", 8.99, 87, 23987544));
        items.add(new StoreItem("Chair", 49.33, 84, 234523523));
        items.add(new StoreItem("Concrete Bag", 38.39, 457, 23452342));

        showData(items);

        System.out.println("\n\t<<Ascending sort of Names by Insertion>>\n");
        sortName(items, 1);

        System.out.println("\n\t<<Descending sort of Names by Insertion>>\n");
        sortName(items, 2);

        System.out.println("\n\t<<Ascending sort of Prices by Selection>>\n");
        sortPrice(items, 1);

        System.out.println("\n\t<<Descending sort of Prices by Selection>>\n");
        sortPrice(items, 2);

        System.out.println("\n\t<<Ascending sort of Product Numbers by Merge>>\n");
        showData(sortProductNumber(items, 1));

        System.out.println("\n\t<<Descending sort of Product Numbers by Merge>>\n");
        showData(sortProductNumber(items, 2));
    }

    public static void sortName(List<StoreItem> items, int order) {
        List<StoreItem> newItems = new ArrayList<StoreItem>();
        boolean ascending = order == 1;

        for (StoreItem item : items) {
            if (newItems.size() == 0) {
                newItems.add(item);
            } else {
                for (int i = 0; i < newItems.size(); i++) {
                    if (newItems.get(i).getName().compareTo(item.getName()) * (ascending ? -1 : 1) >= 0) {
                        newItems.add(i, item);
                        break;
                    } else if ((i + 1) == newItems.size()) {
                        newItems.add(item);
                        break;
                    }
                }
            }
        }
        showData(newItems);
    }

    public static void sortPrice(List<StoreItem> items, int order) {
        int currentBest = 0;
        boolean ascending = order == 1;
        for (int i = 0; i < items.size(); i++) {
            currentBest = i;
            for (int j = i; j < items.size(); j++) {
                if ((items.get(currentBest).getPrice() - items.get(j).getPrice()) * (ascending ? -1 : 1) < 0) {
                    currentBest = j;
                }
            }
            items.add(i, items.get(currentBest));
            items.remove(currentBest + 1);
        }
        showData(items);
    }

    public static List<StoreItem> sortProductNumber(List<StoreItem> movies, int order) {
        boolean ascending = order == 1;
        List<StoreItem> finalList = new ArrayList<StoreItem>();
        if (movies.size() > 1) {
            List<List<StoreItem>> nestedMovies = breakInTwo(movies);
            nestedMovies.set(1, sortProductNumber(nestedMovies.get(1), order));
            nestedMovies.set(0, sortProductNumber(nestedMovies.get(0), order));

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

                if ((nestedMovies.get(0).get(0).getProductNumber() - nestedMovies.get(1).get(0).getProductNumber()) * (ascending ? -1 : 1) >= 0) {
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

    public static List<List<StoreItem>> breakInTwo(List<StoreItem> movies) {
        List<List<StoreItem>> returnList = new ArrayList<List<StoreItem>>();
        returnList.add(new ArrayList<StoreItem>());
        returnList.add(new ArrayList<StoreItem>());

        int index = (movies.size() / 2);

        for (int i = 0; i < index; i++) {
            returnList.get(0).add(movies.get(i));
        }
        for (int i = index; i < movies.size(); i++) {
            returnList.get(1).add(movies.get(i));
        }
        return returnList;
    }

    public static void showData(List<StoreItem> items) {
        System.out.println(StoreItem.getHeader());
        for (StoreItem item : items) {
            System.out.println(item.toString());
        }
    }
}