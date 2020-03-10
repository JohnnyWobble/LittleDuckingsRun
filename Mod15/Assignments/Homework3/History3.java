/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class History3 extends Homework3 {
    public History3() {
        super();
    }

    public void type(int numPages) {
        setPages(numPages);
        setType("History");
    }

    public void doHomework(int readPages) {
        setPages(getPages() - readPages);
    }
}