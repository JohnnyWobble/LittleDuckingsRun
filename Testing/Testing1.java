import java.util.Scanner;   

public class Testing1 {
    public static void main(String[ ] args) {
        String genderString = "asdas0asd";
        String ageString = "34";

        int gender = genderString.indexOf('0');
        System.out.println(gender);
        boolean isFemale = gender == 'F';
        int age = Integer.parseInt(ageString);
    }
}