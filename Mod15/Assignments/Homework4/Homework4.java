/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public abstract class Homework4 implements Processing4, Comparable<Homework4>{
    private int numPages;
    private String hwType;

    public Homework4() {
        numPages = 0;
        hwType = "none";
    }

    public int getPages() {
        return numPages;
    }

    public void setPages(int numPages) {
        this.numPages = numPages;
    }

    public String getType() {
        return hwType;
    }

    public void setType(String hwType) {
        this.hwType = hwType;
    }

    public String toString() {
        return hwType + " - " + numPages + " pages";
    }

    @Override
    public int compareTo(Homework4 arg0) {
        return numPages - arg0.getPages();
    }

    public abstract void type(int numPages);
}