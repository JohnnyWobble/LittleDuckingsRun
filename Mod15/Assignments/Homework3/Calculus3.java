/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class Calculus3 extends Homework3 {
    public Calculus3() {
        super();
    }

    public void type(int numPages) {
        setPages(numPages);
        setType("Calculus");
    }

    public void doHomework(int readPages) {
        setPages(getPages() - readPages);
    }
}