/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class English3 extends Homework3 {
    public English3() {
        super();
    }

    public void type(int numPages) {
        setPages(numPages);
        setType("English");
    }

    public void doHomework(int readPages) {
        setPages(getPages() - readPages);
    }
}