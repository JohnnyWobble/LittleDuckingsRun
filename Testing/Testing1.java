/**
 * <desciption>
 * 
 * @author Max Gordon
 * @version 12/13/2019
 */

public class Testing1 {
    public static void main(String[] args) {
        System.out.println(timeFinder("09:30"));
        System.out.println(timeFinder("13:20"));
        System.out.println(timeFinder("01:59"));
        System.out.println(timeFinder("24:12"));
        // System.out.println(timeFinder());
    }

    public static String timeFinder(String worldFormat) {
int hh = Integer.parseInt(worldFormat.substring(0, 2));
String other = worldFormat.substring(2, 5);
String form = " AM";

if (hh >= 12) {
hh -= 12;
form = " PM";
}
return (hh + other + form);
        
    }
}