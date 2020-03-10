/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class History4 extends Homework4 {
    public History4() {
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