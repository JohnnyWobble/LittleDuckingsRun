/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class Calculus4 extends Homework4 {
    public Calculus4() {
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