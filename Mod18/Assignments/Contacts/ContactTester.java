import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 
 * @author Max Gordon
 * @version 04/15/2020
 */

public class ContactTester {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Bob Dylan", "Father", "12/30/1993", "(345)647-1347", "bob.dylan@gmail.com"));
        contacts.add(new Contact("Steve Dylan", "Brother", "2/14/2005", "(543)876-9789", "steve.steveson@hotmail.com"));
        contacts.add(new Contact("Shauwna Peterson", "Mother", "9/13/1969", "(353)345-5677", "shauwna.peterson@comcast.net"));
        contacts.add(new Contact("Fillip Dylan", "Brother", "2/8/2008", "(345)358-0045", "phillip.dylan@outlook.com"));
        contacts.add(new Contact("Pesto Dylan", "Daughter", "6/7/2018", "(653)010-8543", "pesto.dylan@gmail.com"));
        contacts.add(new Contact("Isabel Sauerkraut", "Aunt", "10/12/1900", "(420)345-0385", "isabel.sauerkraut@yahoo.com"));
        contacts.add(new Contact("Pizza Dylan", "Son", "6/7/2018", "(653)010-8543", "pizza.dylan@gmail.com"));
        contacts.add(new Contact("Arnold Virginia", "Great-Aunt", "5/25/1953", "(345)983-0492", "arnold.virgina@aol.com"));
        contacts.add(new Contact("Spebe Robs", "God-Father", "8/18/1986", "(359)234-9864", "spebe.robs@icloud.com"));
        contacts.add(new Contact("Ikea Dumpsterfire", "Uncle", "11/29/1974", "(456)232-0349", "bob.dylan@gmail.com"));
        contacts.add(new Contact("Susan Collins", "Friend", "1/23/2007", "(349)985-8483", "susan.collins@mail.com"));

        showData(contacts);

        System.out.println("\n\n\t<< Search by Name >>\n");

        contacts = sortName(contacts, -1);
        System.out.println("Searching: \"Fillip Dylan\"");
        findName(contacts, "Fillip Dylan");
        System.out.println();
        System.out.println("Searching: \"Elton John\"");
        findName(contacts, "Elton John");
        System.out.println();
        
        System.out.println("\n\t<< Search by Relationship >>\n");

        contacts = sortRelationship(contacts, -1);
        System.out.println(" > Searching: \"Brother\"");
        findRelationship(contacts, "Brother");
        System.out.println();
        System.out.println(" > Searching: \"Aunt\"");
        findRelationship(contacts, "Aunt");
        System.out.println();
        System.out.println(" > Searching: \"Great-Uncle\"");
        findRelationship(contacts, "Great-Uncle");
        System.out.println();

        System.out.println("\n\t<< Search by Month >>\n");

        System.out.println(" > Searching: February");
        findMonth(contacts, "2");
        System.out.println();
        System.out.println(" > Searching: September");
        findMonth(contacts, "9");
        System.out.println();
        System.out.println(" > Searching: March");
        findMonth(contacts, "3");
        System.out.println();

        System.out.println("\n\t<< Search by Phone Number >>\n");

        System.out.println(" > Searching: (653)010-8543");
        findNumber(contacts, "(653)010-8543");
        System.out.println();
        System.out.println(" > Searching: (456)232-0349");
        findNumber(contacts, "(456)232-0349");
        System.out.println();
        System.out.println(" > Searching: (123)-456-7890");
        findNumber(contacts, "(123)-456-7890");
        System.out.println();

        System.out.println("\n\t<< Search by Email Address >>\n");

        System.out.println(" > Searching: isabel.sauerkraut@yahoo.com");
        findEmail(contacts, "isabel.sauerkraut@yahoo.com");
        System.out.println();
        System.out.println(" > Searching: max.gordon@gmail.com");
        findEmail(contacts, "max.gordon@gmail.com");
        System.out.println();
    }

    public static void findEmail(List<Contact> contacts, String email) {
        boolean printed = false;
        for (Contact c : contacts) {
            if (c.getEmail().equals(email)) {
                System.out.println(c);
                printed = true;
            }
        }
        if (!printed) {
            System.out.println("No results found");
        }
    }

    public static void findNumber(List<Contact> contacts, String number) {
        boolean printed = false;
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(number)) {
                System.out.println(c);
                printed = true;
            }
        }
        if (!printed) {
            System.out.println("No results found");
        }
    }

    public static void findMonth(List<Contact> contacts, String month) {
        boolean printed = false;
        for (Contact c : contacts) {
            int idx = c.getBirthday().indexOf("/");
            if (c.getBirthday().substring(0, idx).equals(month)) {
                System.out.println(c);
                printed = true;
            }
        }
        if (!printed) {
            System.out.println("No results found");
        }
    }

    public static void showData(List<Contact> contacts) {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
    
    public static void findName(List<Contact> contacts, String name) {
        findName(contacts, name, 0, contacts.size() - 1);
    }

    public static void findRelationship(List<Contact> contacts, String relationship) {
        findRelationship(contacts, relationship, 0, contacts.size() - 1);
    }
    

    public static void findName(List<Contact> contacts, String name, int low, int high) {
        int centerIndex = (low + high) / 2;
        Contact center = contacts.get(centerIndex);
        if (center.getName().equals(name)) {
            linearPrint(contacts, centerIndex, (Contact m) -> m.getName().equals(name));
            return;
        } else if (center.getName().compareTo(name) > 0) {
            high = Math.max(centerIndex - 1, low);
        } else {
            low = Math.min(centerIndex + 1, high);
        }

        if (low == high) {
            linearPrint(contacts, low, (Contact m) -> m.getName().equals(name));
        } else {
            findName(contacts, name, low, high);
        }
    }

    public static void findRelationship(List<Contact> contacts, String relationship, int low, int high) {
        int centerIndex = (low + high) / 2;
        Contact center = contacts.get(centerIndex);
        if (center.getRelationship().equals(relationship)) {
            linearPrint(contacts, centerIndex, (Contact m) -> m.getRelationship().equals(relationship));
            return;
        } else if (center.getRelationship().compareTo(relationship) > 0) {
            high = Math.max(centerIndex - 1, low);
        } else {
            low = Math.min(centerIndex + 1, high);
        }

        if (low == high) {
            linearPrint(contacts, low, (Contact m) -> m.getRelationship().equals(relationship));
        } else {
            findRelationship(contacts, relationship, low, high);
        }
    }

    public static void linearPrint(List<Contact> contacts, int index, Function<Contact, Boolean> key) {
        while (index > 0 && key.apply(contacts.get(index - 1)) ) {
            index -= 1;
        }

        int tmp = index;
        while (index < contacts.size() && key.apply(contacts.get(index))) {
            System.out.println(contacts.get(index));
            index += 1;
        }

        if (tmp == index) {
            System.out.println("No results found");
        }
    }


    public static List<Contact> sortName(List<Contact> contacts, int order) {
        boolean ascending = order == 1;
        List<Contact> finalList = new ArrayList<Contact>();
        if (contacts.size() > 1) {
            List<List<Contact>> nestedContact = breakInTwo(contacts);
            nestedContact.set(1, sortName(nestedContact.get(1), order));
            nestedContact.set(0, sortName(nestedContact.get(0), order));

            while (nestedContact.get(0).size() > 0 || nestedContact.get(1).size() > 0) {
                if (nestedContact.get(0).size() > 0 && nestedContact.get(1).size() == 0) {
                    finalList.add(nestedContact.get(0).get(0));
                    nestedContact.get(0).remove(0);
                    continue;
                } else if (nestedContact.get(0).size() == 0 && nestedContact.get(1).size() > 0) {
                    finalList.add(nestedContact.get(1).get(0));
                    nestedContact.get(1).remove(0);
                    continue;
                }

                if ((nestedContact.get(0).get(0).getName().compareTo(nestedContact.get(1).get(0).getName())) * (ascending ? 1 : -1) > 0) { finalList.add(nestedContact.get(0).get(0)); nestedContact.get(0).remove(0);
                } else {
                    finalList.add(nestedContact.get(1).get(0));
                    nestedContact.get(1).remove(0);
                }
            }
        } else {
            return contacts;
        }
        return finalList;
    }

    public static List<Contact> sortRelationship(List<Contact> contacts, int order) {
        boolean ascending = order == 1;
        List<Contact> finalList = new ArrayList<Contact>();
        if (contacts.size() > 1) {
            List<List<Contact>> nestedContact = breakInTwo(contacts);
            nestedContact.set(1, sortRelationship(nestedContact.get(1), order));
            nestedContact.set(0, sortRelationship(nestedContact.get(0), order));

            while (nestedContact.get(0).size() > 0 || nestedContact.get(1).size() > 0) {
                if (nestedContact.get(0).size() > 0 && nestedContact.get(1).size() == 0) {
                    finalList.add(nestedContact.get(0).get(0));
                    nestedContact.get(0).remove(0);
                    continue;
                } else if (nestedContact.get(0).size() == 0 && nestedContact.get(1).size() > 0) {
                    finalList.add(nestedContact.get(1).get(0));
                    nestedContact.get(1).remove(0);
                    continue;
                }

                if ((nestedContact.get(0).get(0).getRelationship().compareTo(nestedContact.get(1).get(0).getRelationship())) * (ascending ? 1 : -1) > 0) { finalList.add(nestedContact.get(0).get(0)); nestedContact.get(0).remove(0);
                } else {
                    finalList.add(nestedContact.get(1).get(0));
                    nestedContact.get(1).remove(0);
                }
            }
        } else {
            return contacts;
        }
        return finalList;
    }

    public static List<List<Contact>> breakInTwo(List<Contact> contacts) {
        List<List<Contact>> returnList = new ArrayList<List<Contact>>();
        returnList.add(new ArrayList<Contact>());
        returnList.add(new ArrayList<Contact>());

        int index = (contacts.size() / 2);

        for (int i = 0; i < index; i++) {
            returnList.get(0).add(contacts.get(i));
        }
        for (int i = index; i < contacts.size(); i++) {
            returnList.get(1).add(contacts.get(i));
        }
        return returnList;
    }
}