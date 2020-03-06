/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public abstract class Homework {
    private int numPages;
    private String hwType;

    public Homework() {
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

    public abstract void type(int numPages);
}